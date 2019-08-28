package com.chunlei.shop.model.duct;

/**
 * @Created by lcl on 2019/8/27 0027
 * 物流
 */
public class Logistics {
    private Boolean isFree;
    private Integer feeType;
    private String feeTypeStr;

    public Logistics() {
    }

    public Logistics(Boolean isFree, Integer feeType, String feeTypeStr) {
        this.isFree = isFree;
        this.feeType = feeType;
        this.feeTypeStr = feeTypeStr;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public String getFeeTypeStr() {
        return feeTypeStr;
    }

    public void setFeeTypeStr(String feeTypeStr) {
        this.feeTypeStr = feeTypeStr;
    }
}
