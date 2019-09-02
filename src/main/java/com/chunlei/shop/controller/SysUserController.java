package com.chunlei.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.chunlei.shop.common.MsgConstant;
import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.UserService;
import com.chunlei.shop.utils.Reqclient;
import com.chunlei.shop.utils.StringTool;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Created by lcl on 2019/8/22 0022
 */
@RestController
@RequestMapping("/user")
@Api(value = "客户基础信息")
public class SysUserController {
    private static final Logger log = LoggerFactory.getLogger(SysUserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/wxLogin",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="微信快捷登录", notes="微信快捷登录")
    public ApiResp wxLogin(@RequestParam String code){
        ApiResp<String> resp = new ApiResp();
        log.info("\n-----微信快捷登录---->"+code);
        if(StringTool.isBlank(code)){
            resp.respErr(MsgConstant.PARAMS_NULL_ERR);
        }else {
            //获取微信的openid
            String respJson = Reqclient.getWxOpenId(code);
            if(StringTool.isBlank(respJson)){
                resp.respErr(MsgConstant.SYS_ERR);
            }else {
                // 解析相应内容（转换成json对象）
                JSONObject json = JSONObject.parseObject(respJson);
                // 用户的唯一标识（openid）
                //{"openid":"oYmsa0VexWjPUPA_k1qy5JiXHWAg","session_key":"t5EjTGmnmfJfR0YNMsjV5w==","expires_in":7200}
                String openId = json.getString("openid");
//                String openId = "oYmsa0VexWjPUPA_k1qy5JiXHWAg";
                if(StringTool.isBlank(openId)){
                    log.error("\n获取openid失败-->"+json.toJSONString());
                    resp.respErr(MsgConstant.SYS_ERR);
                }else {
                    SysUser user = new SysUser();
                    user.setWxOpenId(openId);
                    userService.loginApp(user,resp);
                }
            }
        }
        return resp;
    }

    @RequestMapping(value = "/wxInfo",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="更新微信用户信息", notes="根据token更新用户信息")
    public ApiResp wxInfo(@RequestBody SysUser sysUser){
        log.info("\n更新微信用户信息--->"+sysUser);
        ApiResp resp = new ApiResp();
        userService.updateWxInfo(sysUser,resp);
        return resp;
    }

    @RequestMapping(value = "/auth",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="用户信息校验", notes="根据token校验获取用户信息")
    public ApiResp wxInfo(@RequestParam String token){
        log.info("\n用户信息校验--->"+token);
        ApiResp<SysUser> resp = new ApiResp();
        userService.aurhInfo(token,resp);
        return resp;
    }


}
