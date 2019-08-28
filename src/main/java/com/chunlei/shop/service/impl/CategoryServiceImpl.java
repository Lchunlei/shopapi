package com.chunlei.shop.service.impl;

import com.chunlei.shop.common.MsgConstant;
import com.chunlei.shop.entity.AppCategory;
import com.chunlei.shop.mapper.CategoryMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void findAll(ApiResp<List<AppCategory>> resp) {
        List<AppCategory> categories =  categoryMapper.findAll();
        if(categories.isEmpty()){
            resp.respErr(MsgConstant.DATA_NULL);
        }else {
            resp.setRespData(categories);
        }
    }


}
