package com.kanzhun.dz.bi.dao.mapper;

import com.kanzhun.dz.bi.dao.model.Test;
import com.kanzhun.dz.bi.dao.model.TestExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface TestMapper {
    @SelectProvider(type = TestSqlProvider.class, method = "countByExample")
    int countByExample(TestExample example);

    @DeleteProvider(type = TestSqlProvider.class, method = "deleteByExample")
    int deleteByExample(TestExample example);

    @Delete({
            "delete from test",
            "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into test (NAME)",
            "values (#{name,jdbcType=VARCHAR})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Test record);

    @InsertProvider(type = TestSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(Test record);

    @SelectProvider(type = TestSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR)
    })
    List<Test> selectByExample(TestExample example);

    @Select({
            "select",
            "ID, NAME",
            "from test",
            "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "ID", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "NAME", property = "name", jdbcType = JdbcType.VARCHAR)
    })
    Test selectByPrimaryKey(Integer id);

    @UpdateProvider(type = TestSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type = TestSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    @UpdateProvider(type = TestSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Test record);

    @Update({
            "update test",
            "set NAME = #{name,jdbcType=VARCHAR}",
            "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Test record);
}