package com.chunlei.shop.service;

import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.model.duct.GoodsDetails;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public interface GoodsService {

    public void findGoodsDetails(Integer ductId, ApiResp<GoodsDetails> resp);

}
