package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.BaseProduct;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Created by lcl on 2019/8/27 0027
 */
@Repository
public interface ProductMapper {

    @Select("SELECT * FROM product_info WHERE ductId=#{ductId}")
    BaseProduct findById(@Param("ductId")Integer ductId);

}
