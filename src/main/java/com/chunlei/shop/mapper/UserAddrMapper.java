package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.SysUser;
import com.chunlei.shop.entity.UserAddr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created by lcl on 2019/8/30 0030
 */
@Repository
public interface UserAddrMapper {

    @Insert("INSERT INTO user_addr(`userId`, `receiveName`, `receiveMobile`, `receiveProvince`, `receiveCity`, `receiveTown`, `receiveAddr`) VALUES (#{userId},#{receiveName},#{receiveMobile},#{receiveProvince},#{receiveCity},#{receiveTown},#{receiveAddr})")
    int insertOne(UserAddr userAddr);

    @Select("SELECT * FROM user_addr WHERE userId=#{userId}")
    List<UserAddr> findMyAddr(Integer userId);

    @Update("UPDATE user_addr SET receiveName=#{receiveName},receiveMobile=#{receiveMobile},receiveProvince=#{receiveProvince},receiveCity=#{receiveCity},receiveTown=#{receiveTown},receiveAddr=#{receiveAddr} WHERE addrId=#{addrId}")
    int updateAddr(UserAddr userAddr);

    @Delete("DELETE FROM user_addr WHERE addrId=#{addrId}")
    int delAddr(Integer addrId);

}
