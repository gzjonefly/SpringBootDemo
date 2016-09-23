package com.springbootmaven.dao.ext.mapper;

import com.kanzhun.dz.bi.dao.model.Test;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author guozijian
 * @date 2016/9/3 18:21
 */
public interface UserMapper {

    @Select("SELECT * FROM test WHERE id = #{id}")
    Test findById(@Param("id") Integer id);

}