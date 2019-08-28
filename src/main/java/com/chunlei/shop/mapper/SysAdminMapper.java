package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.SysAdmin;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @Created by lcl on 2019/8/20 0020
 */
@Repository
public interface SysAdminMapper {

    @Insert("INSERT INTO sys_admin(`userName`,`passWord`, `cTime`) VALUES (#{userName},#{passWord},NOW())")
    int insertOne(SysAdmin sysAdmin);

}
