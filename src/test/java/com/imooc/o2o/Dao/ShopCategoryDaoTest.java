package com.imooc.o2o.Dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dao.ShopCategoryDao;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShopCategoryDaoTest extends BaseTest{

    @Autowired
    ShopCategoryDao shopCategoryDao;

    @Test
    public void queryShopCategoryTest(){
        List<ShopCategory> categoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
        System.out.print(categoryList);
    }

}
