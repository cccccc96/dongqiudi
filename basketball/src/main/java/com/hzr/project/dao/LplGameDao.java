package com.hzr.project.dao;

import com.hzr.project.model.LplGame;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LplGameDao {
    @Select("select * from lplPlayer where Year = #{year} and Season = #{season}")
    List<LplGame> selectLplGame(@Param("year")String t1, @Param("season") String t2);
}
