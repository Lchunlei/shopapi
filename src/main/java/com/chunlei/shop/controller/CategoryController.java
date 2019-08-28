package com.chunlei.shop.controller;

import com.chunlei.shop.entity.AppCategory;
import com.chunlei.shop.entity.AppShowConfig;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.CategoryService;
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
 * @Created by lcl on 2019/8/27 0027
 */
@RestController
@RequestMapping("/cate")
@Api(value = "商品分类")
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/all",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="全部分类", notes="查看一二级分类")
    public ApiResp showAllCate(){
        ApiResp<List<AppCategory>> resp = new ApiResp();
        categoryService.findAll(resp);
        return resp;
    }



}
