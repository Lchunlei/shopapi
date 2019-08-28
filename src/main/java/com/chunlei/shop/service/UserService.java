package com.chunlei.shop.service;

import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.model.ApiResp;

/**
 * @Created by lcl on 2019/8/22 0022
 */
public interface UserService {

    public void loginApp(SysUser sysUser, ApiResp<String> apiResp);

}
