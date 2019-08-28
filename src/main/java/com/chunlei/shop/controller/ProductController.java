package com.chunlei.shop.controller;

import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.model.duct.GoodsDetails;
import com.chunlei.shop.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by lcl on 2019/8/27 0027
 */
@RestController
@RequestMapping("/goods")
@Api(value = "商品信息")
public class ProductController {
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/info",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="商品详情", notes="根据ID查看商品详情")
    public ApiResp goodsInfo(@RequestParam Integer ductId){
        log.info("\n-----商品详情ductId---->"+ductId);
        ApiResp<GoodsDetails> resp = new ApiResp();
        goodsService.findGoodsDetails(ductId,resp);
        return resp;
    }


}
