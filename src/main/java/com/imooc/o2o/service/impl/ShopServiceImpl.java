package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtil;
import com.imooc.o2o.util.PathUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.beans.Transient;
import java.io.File;
import java.util.Date;

@Service
public class ShopServiceImpl implements ShopService{

    private static Logger logger = LoggerFactory.getLogger(ShopService.class);
    @Autowired
    ShopDao shopDao;

    /**
     * 新增店铺测试
     * @param shop
     * @param shopImg
     * @return
     */
    @Override
    @Transient
    public ShopExecution addShop(Shop shop, File shopImg) {

        if (shop == null){
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            int effectedNum = shopDao.insertShop(shop);
            if (effectedNum<=0){
                throw new RuntimeException("店铺创建失败");
            }else {
                if (shopImg!=null){
                    try {
                        addShopImg(shop,shopImg);
                    }catch (Exception e){
                        throw new ShopOperationException("add shop error1:"+e.toString());
                    }
                    effectedNum = shopDao.updateShop(shop);
                    logger.debug(shop.toString());
                    if (effectedNum<=0){
                        throw new ShopOperationException("更新图片地址失败");
                    }
                }
            }
        }catch(Exception e){
                throw new ShopOperationException("add shop error2:"+e.getMessage());
        }

        return new ShopExecution(ShopStateEnum.Check,shop);
    }

    private void addShopImg(Shop shop,File shopImg){
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg,dest);
        logger.info("dest: "+dest);
        logger.info("shopImgAddr: "+shopImgAddr);
        shop.setShopImg(shopImgAddr);
    }
}
