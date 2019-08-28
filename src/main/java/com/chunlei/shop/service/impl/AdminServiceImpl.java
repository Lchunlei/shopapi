package com.chunlei.shop.service.impl;

import com.chunlei.shop.entity.SysAdmin;
import com.chunlei.shop.mapper.SysAdminMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created by lcl on 2019/8/20 0020
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private SysAdminMapper sysAdminMapper;

    @Override
    public void addAdmin(SysAdmin sysAdmin, ApiResp apiResp) {
        sysAdminMapper.insertOne(sysAdmin);
    }

}
