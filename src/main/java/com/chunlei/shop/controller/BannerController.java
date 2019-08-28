package com.chunlei.shop.controller;

import com.chunlei.shop.entity.AppBanner;
import com.chunlei.shop.entity.SysAdmin;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.BannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created by lcl on 2019/8/26 0026
 */
@RestController
@RequestMapping("/banner")
@Api(value = "轮播图")
public class BannerController {
    private static final Logger log = LoggerFactory.getLogger(BannerController.class);
    @Autowired
    private BannerService bannerService;

    @RequestMapping(value = "/show",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="轮播图展示", notes="支持各渠道轮播图展示")
    public ApiResp banShow(@RequestParam String banType){
        log.info("\n-----轮播图展示banType---->"+banType);
        ApiResp<List<AppBanner>> resp = new ApiResp();
        bannerService.findAllBanners(banType,resp);
        log.info("\n-----轮播图展示R---->"+resp);
        return resp;
    }


}
