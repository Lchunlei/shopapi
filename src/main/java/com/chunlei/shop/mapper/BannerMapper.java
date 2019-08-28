package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.AppBanner;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created by lcl on 2019/8/26 0026
 */
@Repository
public interface BannerMapper {

    @Select("SELECT * FROM app_banner WHERE banType=#{banType} AND banStatus=1 ORDER BY paixu")
    List<AppBanner> findAll(@Param("banType")String banType);


}
