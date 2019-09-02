package com.chunlei.shop.service;

import com.chunlei.shop.entity.BaseProduct;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.model.duct.GoodsDetails;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public interface GoodsService {

    public void findGoodsDetails(Integer ductId, ApiResp<GoodsDetails> resp);

    public void findGoodsList(Integer pageSize,Integer pageNum,Integer recommendStatus, ApiResp<List<BaseProduct>> resp);


}
