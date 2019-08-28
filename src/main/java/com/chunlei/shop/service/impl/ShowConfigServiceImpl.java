package com.chunlei.shop.service.impl;

import com.chunlei.shop.common.MsgConstant;
import com.chunlei.shop.entity.AppShowConfig;
import com.chunlei.shop.mapper.ShowConfigMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.ShowConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created by lcl on 2019/8/26 0026
 */
@Service
public class ShowConfigServiceImpl implements ShowConfigService {

    @Autowired
    private ShowConfigMapper showConfigMapper;

    @Override
    public void findShowConfig(String keyType, ApiResp<AppShowConfig> apiResp) {
        AppShowConfig config = showConfigMapper.findShowConfig(keyType);
        if(config==null){
            apiResp.respErr(MsgConstant.DATA_NULL);
        }else {
            apiResp.setRespData(config);
        }
    }


}
