package com.chunlei.shop.controller;

import com.chunlei.shop.entity.SysAdmin;
import com.chunlei.shop.model.ApiResp;
import com.chunlei.shop.service.AdminService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by lcl on 2019/8/19 0019
 */
@RestController
@RequestMapping("/test")
@Api(value = "一个用来测试动态API")
public class TestHelloController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "get",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="根据用户编号获取用户姓名", notes="test: 仅1和2有正确返回")
//    @ApiImplicitParam(paramType="query", name = "reqLclstr", value = "请求唯一值", required = true, dataType = "Integer")
    public ApiResp test1(@RequestParam Integer reqLclstr){
        System.out.println("--------->"+reqLclstr);
        ApiResp resp = new ApiResp();
        SysAdmin sysAdmin = new SysAdmin();
        sysAdmin.setAdminName("刘大鹏");
        sysAdmin.setPassWord("123456");
        adminService.addAdmin(sysAdmin,resp);
        return resp;
    }

    @RequestMapping(value = "moreGet",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ApiOperation(value="根据用户编号获取用户姓名", notes="test: 仅1和2有正确返回")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType="query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
//            @ApiImplicitParam(paramType="query", name = "password", value = "旧密码", required = true, dataType = "String")
//    })
    public ApiResp test2(@RequestParam Integer userId,@RequestParam String password){
        ApiResp resp = new ApiResp();
        System.out.println("---->"+userId+"--->"+password);
        return resp;
    }



}
