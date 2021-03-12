package com.hzr.project.dao;

import com.hzr.project.model.LplPlayer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LplPlayerDao {
    @Select("select * from lplPlayer where Year = #{year} and Season = #{season} ")
    List<LplPlayer> SelectLplPlayer(@Param("year")String t1, @Param("season") String t2);
}
