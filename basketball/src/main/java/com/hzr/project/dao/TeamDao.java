package com.hzr.project.dao;

import com.hzr.project.model.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeamDao {
    @Select("select * from team where team = #{winner} or team= #{loser}")
    List<Team> selectTeam(@Param("winner")String t1, @Param("loser") String t2 );
}
