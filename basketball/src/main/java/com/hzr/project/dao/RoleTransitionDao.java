package com.hzr.project.dao;

import com.hzr.project.model.History;
import com.hzr.project.model.RoleTransition;
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
public interface RoleTransitionDao {
    @Select("select * from NCAA_NBA")
    List<RoleTransition> selectRookiePlayer();
}
