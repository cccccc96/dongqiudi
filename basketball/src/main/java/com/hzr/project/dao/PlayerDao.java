package com.hzr.project.dao;

import com.hzr.project.model.Player;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlayerDao {
    @Select("select * from player where team = #{winner} or team = #{loser} ")
    List<Player> getPlayer(@Param("winner") String t1, @Param("loser") String t2 );
}
