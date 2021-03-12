package com.hzr.project.dao;

import com.hzr.project.model.Text;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TextDao {
    @Select("SELECT * FROM text where winner= #{winner} and loser = #{loser}")
    Text selectByTeam(@Param("winner") String t1 , @Param("loser") String t2);
}
