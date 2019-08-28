package com.chunlei.shop.service;

import com.chunlei.shop.entity.AppShowConfig;
import com.chunlei.shop.model.ApiResp;

/**
 * @Created by lcl on 2019/8/26 0026
 */
public interface ShowConfigService {

    public void findShowConfig(String keyType, ApiResp<AppShowConfig> apiResp);

}
