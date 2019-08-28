package com.chunlei.shop.service.impl;

import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.mapper.SysUserMapper;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Created by lcl on 2019/8/22 0022
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void loginApp(SysUser sysUser, ApiResp<String> apiResp) {
        //查询用户是否存在
        SysUser oldUser = sysUserMapper.findByOpenid(sysUser.getWxOpenId());
        if(oldUser==null){
            SimpleDateFormat format0 = new SimpleDateFormat("yyyyMMdd");
            String time = format0.format(new Date());
            String keyStr = sysUser.getWxOpenId() + time;
            //微信登录成功
            String md5Str = DigestUtils.md5DigestAsHex(keyStr.getBytes());
            log.info("\nmd5Str--->"+md5Str);
            sysUser.setAppToken(md5Str);
            sysUserMapper.insertOne(sysUser);
            apiResp.setRespData(md5Str);
        }else{
            apiResp.setRespData(oldUser.getAppToken());
            sysUserMapper.updateLoginTime(oldUser.getUserId());
        }
    }


}
