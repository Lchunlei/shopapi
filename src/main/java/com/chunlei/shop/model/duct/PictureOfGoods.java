package com.chunlei.shop.model.duct;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public class PictureOfGoods {
    private Integer ductId;
    private Integer picId;
    private String pic;

    public PictureOfGoods() {
    }

    public PictureOfGoods(Integer ductId, Integer picId, String pic) {
        this.ductId = ductId;
        this.picId = picId;
        this.pic = pic;
    }

    public Integer getDuctId() {
        return ductId;
    }

    public void setDuctId(Integer ductId) {
        this.ductId = ductId;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
