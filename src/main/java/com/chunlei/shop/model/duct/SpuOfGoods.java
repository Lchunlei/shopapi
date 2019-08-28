package com.chunlei.shop.model.duct;

import java.util.Date;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public class SpuOfGoods {
    private Integer spuId;
    private String spuName;
    private Integer paixu;
    private String spuRemark;
    private Date cTime;

    public SpuOfGoods() {
    }

    public SpuOfGoods(Integer spuId, String spuName, Integer paixu, String spuRemark) {
        this.spuId = spuId;
        this.spuName = spuName;
        this.paixu = paixu;
        this.spuRemark = spuRemark;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public Integer getPaixu() {
        return paixu;
    }

    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }

    public String getSpuRemark() {
        return spuRemark;
    }

    public void setSpuRemark(String spuRemark) {
        this.spuRemark = spuRemark;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
