package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @Created by lcl on 2019/8/22 0022
 */
@Repository
public interface SysUserMapper {

    @Insert("INSERT INTO app_user(`appToken`,`wxOpenId`, `loginTime`,`cTime`) VALUES (#{appToken},#{wxOpenId},NOW(),NOW())")
    int insertOne(SysUser sysUser);

    @Update("UPDATE app_user SET wxOpenId=#{wxOpenId},wxHeadUrl=#{wxHeadUrl},uTime=NOW() WHERE userId=#{userId}")
    int addWxInfo(SysUser sysUser);

    @Select("SELECT * FROM app_user WHERE wxOpenId=#{wxOpenId}")
    SysUser findByOpenid(String wxOpenId);

    @Update("UPDATE app_user SET loginTime=NOW() WHERE userId=#{userId}")
    int updateLoginTime(Integer userId);




}
