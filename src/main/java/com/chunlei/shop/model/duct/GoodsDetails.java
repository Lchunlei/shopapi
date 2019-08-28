package com.chunlei.shop.model.duct;

import com.chunlei.shop.entity.AppCategory;
import com.chunlei.shop.entity.BaseProduct;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 * 商品详情
 */
public class GoodsDetails {
    private Logistics logistics;
    private AppCategory category;
    private List<PictureOfGoods> pics;
    private String content;
    private List<PropeOfGoods> properties;
    private BaseProduct basicInfo;

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public AppCategory getCategory() {
        return category;
    }

    public void setCategory(AppCategory category) {
        this.category = category;
    }

    public List<PictureOfGoods> getPics() {
        return pics;
    }

    public void setPics(List<PictureOfGoods> pics) {
        this.pics = pics;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<PropeOfGoods> getProperties() {
        return properties;
    }

    public void setProperties(List<PropeOfGoods> properties) {
        this.properties = properties;
    }

    public BaseProduct getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BaseProduct basicInfo) {
        this.basicInfo = basicInfo;
    }
}
