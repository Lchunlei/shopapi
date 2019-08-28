package com.chunlei.shop.mapper;

import com.chunlei.shop.entity.AppCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Created by lcl on 2019/8/27 0027
 */
@Repository
public interface CategoryMapper {

    @Select("SELECT * FROM category_info WHERE pid=#{pid} AND isUse=1 ORDER BY paixu")
    List<AppCategory> findByPid(@Param("pid")Integer pid);

    @Select("SELECT * FROM category_info WHERE categoryId=#{categoryId}")
    AppCategory findById(@Param("categoryId")Integer categoryId);

    @Select("SELECT * FROM category_info WHERE isUse=1 ORDER BY paixu")
    List<AppCategory> findAll();

}
