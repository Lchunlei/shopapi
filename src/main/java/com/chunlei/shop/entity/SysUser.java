package com.chunlei.shop.entity;

import java.util.Date;

/**
 * @Created by lcl on 2019/8/22 0022
 */
public class SysUser {
    private Integer userId;
    private String appToken;
    private String userName;
    private String loginName;
    private String passWord;
    private String userMobile;
    private String wxOpenId;
    private String wxHeadUrl;
    private Date loginTime;
    private Date cTime;
    private Date uTime;

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", appToken='" + appToken + '\'' +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", wxOpenId='" + wxOpenId + '\'' +
                ", wxHeadUrl='" + wxHeadUrl + '\'' +
                '}';
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxHeadUrl() {
        return wxHeadUrl;
    }

    public void setWxHeadUrl(String wxHeadUrl) {
        this.wxHeadUrl = wxHeadUrl;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getuTime() {
        return uTime;
    }

    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }
}
