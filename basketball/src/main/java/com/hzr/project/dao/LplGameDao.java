package com.hzr.project.dao;

import com.hzr.project.model.LplGame;
import com.hzr.project.model.LplPlayer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LplGameDao {
    @Select("select * from lplGame where Year = #{year} and Season = #{season}")
    List<LplGame> selectLplGame(@Param("year")String t1, @Param("season") String t2);

    @Select("SELECT * FROM lplGame where year=#{year} and season = #{season} order by WinRate desc LIMIT 1")
    List<LplGame> selectTopRateGame(@Param("year")String t1, @Param("season") String t2);

    @Select("SELECT * FROM lplGame where year=#{year} and season = #{season} order by TotalKills desc LIMIT 1")
    List<LplGame> selectTopKillGame(@Param("year")String t1, @Param("season") String t2);

    @Select("SELECT * FROM lplGame where year=#{year} and season = #{season} order by AverageMoney desc LIMIT 1")
    List<LplGame> selectTopMoneyGame(@Param("year")String t1, @Param("season") String t2);

}
