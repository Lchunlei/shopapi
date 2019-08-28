package com.chunlei.shop.model.duct;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public class PropeOfGoods {
    private List<SpuOfGoods> childsCurGoods;

    public List<SpuOfGoods> getChildsCurGoods() {
        return childsCurGoods;
    }

    public void setChildsCurGoods(List<SpuOfGoods> childsCurGoods) {
        this.childsCurGoods = childsCurGoods;
    }
}
