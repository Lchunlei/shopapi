package com.chunlei.shop.sql;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * @Created by lcl on 2019/8/30 0030
 */
public class SysUserSql {

    public String reqParams(Map<String,String> params){
        return new SQL() {
            {
                SELECT("*");
                FROM("user_info");
                if(params.containsKey("wxOpenId")) {
                    WHERE("wxOpenId=#{wxOpenId}");
                }
                if(params.containsKey("appToken")) {
                    WHERE("appToken=#{appToken}");
                }
            }
        }.toString();
    }

}
