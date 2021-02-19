package com.hzr.project.dao;


import com.hzr.project.model.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IRecord {
    @Select("SELECT * FROM result where 1 = 1 and date = #{date} and((lteam = #{team1} and  wteam = #{team2}) or (lteam = #{team2} and wteam = #{team1})) ")
    Result search(@Param("team1") String t1, @Param("team2") String t2, @Param("date") String date);
}
