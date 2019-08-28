package com.chunlei.shop.entity;

import java.util.Date;

/**
 * @Created by lcl on 2019/8/20 0020
 */
public class SysAdmin {
    private Integer sysAdminId;
    private String adminName;
    private String passWord;
    private Date cTime;

    public Integer getSysAdminId() {
        return sysAdminId;
    }

    public void setSysAdminId(Integer sysAdminId) {
        this.sysAdminId = sysAdminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }
}
