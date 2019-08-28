package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.AppShowConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @Created by lcl on 2019/8/26 0026
 */
@Repository
public interface ShowConfigMapper {

    @Select("SELECT * FROM show_config WHERE keyType=#{keyType}")
    AppShowConfig findShowConfig(@Param("keyType")String keyType);

}
