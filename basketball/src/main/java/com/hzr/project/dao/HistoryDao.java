package com.hzr.project.dao;

import com.hzr.project.model.History;
import net.bytebuddy.asm.Advice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hu Zirui
 * @version 1.0.0
 * @ClassName HistoryDao.java
 * @Description TODO
 * @createTime 2021年03月16日 13:02:00
 */
@Mapper
public interface HistoryDao {
    @Select("select * from History where year = #{year} and TeamName = #{TeamName}")
    List<History> selectPlayer(@Param("year") String year, @Param("TeamName") String TeamName);

    @Select("select * from History where PlayerName = #{PlayerName}")
    List<History> selectHistoryPlayer(@Param("PlayerName") String PlayerName);
}
