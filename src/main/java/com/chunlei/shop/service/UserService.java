package com.chunlei.shop.service;

import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.model.ApiResp;

/**
 * @Created by lcl on 2019/8/22 0022
 */
public interface UserService {

    public void aurhInfo(String token, ApiResp<SysUser> apiResp);

    public void loginApp(SysUser sysUser, ApiResp<String> apiResp);

    public void updateWxInfo(SysUser sysUser, ApiResp apiResp);


}
