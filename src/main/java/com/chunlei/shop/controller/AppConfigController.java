package com.chunlei.shop.controller;

import com.chunlei.shop.entity.AppBanner;
import com.chunlei.shop.entity.AppShowConfig;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.ShowConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Created by lcl on 2019/8/26 0026
 */
@RestController
@RequestMapping("/config")
@Api(value = "基础配置")
public class AppConfigController {
    private static final Logger log = LoggerFactory.getLogger(AppConfigController.class);
    @Autowired
    private ShowConfigService showConfigService;

    @RequestMapping(value = "/show",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="基础配置", notes="支持各渠道配置参数展示")
    public ApiResp banShow(@RequestParam String key){
        log.info("\n-----基础配置key---->"+key);
        ApiResp<AppShowConfig> resp = new ApiResp();
        showConfigService.findShowConfig(key,resp);
        return resp;
    }


}
