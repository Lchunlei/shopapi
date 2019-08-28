package com.chunlei.shop.service;

import com.chunlei.shop.entity.AppBanner;
import com.chunlei.shop.model.ApiResp;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by lcl on 2019/8/26 0026
 */
public interface BannerService {

    public void findAllBanners(String banType, ApiResp<List<AppBanner>> resp);

}
