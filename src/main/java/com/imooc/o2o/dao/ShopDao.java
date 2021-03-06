package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

public interface ShopDao {

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    public int insertShop(Shop shop);

    public int updateShop(Shop shop);
}
