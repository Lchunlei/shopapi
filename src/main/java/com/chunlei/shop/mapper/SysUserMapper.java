package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.sql.SysUserSql;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Created by lcl on 2019/8/22 0022
 */
@Repository
public interface SysUserMapper {

    @Insert("INSERT INTO user_info(`appToken`,`wxOpenId`, `loginTime`,`cTime`) VALUES (#{appToken},#{wxOpenId},NOW(),NOW())")
    int insertOne(SysUser sysUser);

    @Update("UPDATE user_info SET userName=#{userName},wxHeadUrl=#{wxHeadUrl},uTime=NOW() WHERE appToken=#{appToken}")
    int addWxInfoByToken(SysUser sysUser);

    @SelectProvider(type= SysUserSql.class, method="reqParams")
    SysUser findByParams(Map<String,String> params);

    @Update("UPDATE user_info SET loginTime=NOW() WHERE userId=#{userId}")
    int updateLoginTime(Integer userId);




}
