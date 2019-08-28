package com.chunlei.shop.service.impl;

import com.chunlei.shop.common.MsgConstant;
import com.chunlei.shop.entity.AppBanner;
import com.chunlei.shop.mapper.BannerMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Created by lcl on 2019/8/26 0026
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public void findAllBanners(String banType, ApiResp<List<AppBanner>> resp) {
        List<AppBanner> banners= bannerMapper.findAll(banType);
        if(banners.isEmpty()){
            resp.respErr(MsgConstant.DATA_NULL);
        }else {
            resp.setRespData(banners);
        }
    }


}
