package com.chunlei.shop.service;

import com.chunlei.shop.entity.AppCategory;
import com.chunlei.shop.model.ApiResp;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
public interface CategoryService {

    public void findAll(ApiResp<List<AppCategory>> resp);

}
