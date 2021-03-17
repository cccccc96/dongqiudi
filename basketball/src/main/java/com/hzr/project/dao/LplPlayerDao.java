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

    @Select("SELECT * FROM lplPlayer where year=#{year} and season = #{season} order by AverageK desc LIMIT 1")
    List<LplPlayer> SelectTopKillPlayer(@Param("year")String t1, @Param("season") String t2);

    @Select("SELECT * FROM lplPlayer where year=#{year} and season = #{season} order by MVP desc LIMIT 1")
    List<LplPlayer> SelectTopAssPlayer(@Param("year")String t1, @Param("season") String t2);

    @Select("SELECT * FROM lplPlayer where year=#{year} and season = #{season} order by KDA desc LIMIT 1")
    List<LplPlayer> SelectTopKDAPlayer(@Param("year")String t1, @Param("season") String t2);

}
