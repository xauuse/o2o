package com.imooc.o2o.entity;

import java.util.Date;

public class ShopCategory {

    private Long shopCategoryId;
    private String shopCateGoryName;
    private String shopCateGoryDesc;
    private String shopCateGoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCateGoryName() {
        return shopCateGoryName;
    }

    public void setShopCateGoryName(String shopCateGoryName) {
        this.shopCateGoryName = shopCateGoryName;
    }

    public String getShopCateGoryDesc() {
        return shopCateGoryDesc;
    }

    public void setShopCateGoryDesc(String shopCateGoryDesc) {
        this.shopCateGoryDesc = shopCateGoryDesc;
    }

    public String getShopCateGoryImg() {
        return shopCateGoryImg;
    }

    public void setShopCateGoryImg(String shopCateGoryImg) {
        this.shopCateGoryImg = shopCateGoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "ShopCategory{" +
                "shopCategoryId=" + shopCategoryId +
                ", shopCateGoryName='" + shopCateGoryName + '\'' +
                ", shopCateGoryDesc='" + shopCateGoryDesc + '\'' +
                ", shopCateGoryImg='" + shopCateGoryImg + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", parent=" + parent +
                '}';
    }
}
