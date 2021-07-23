package com.hzr.project.controller;

import com.hzr.project.dao.HistoryDao;
import com.hzr.project.dao.RoleTransitionDao;
import com.hzr.project.model.History;
import com.hzr.project.model.RoleTransition;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Hu Zirui
 * @version 1.0.0
 * @ClassName BallController.java
 * @Description TODO
 * @createTime 2021年03月16日 13:10:00
 */
@RestController
@Api(tags = "大学生球员转型模块")
@RequestMapping("/ball")
public class BallController {
    @Autowired
    private HistoryDao historyDao;
    @Autowired
    private RoleTransitionDao roleTransitionDao;

    /**
     *
     * @param year
     * @param TeamName
     * @return
     */
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "TeamName",value = "队伍名",required = true)})
    @ApiOperation(value = "获取球员信息")
    @CrossOrigin(origins = "http://139.224.40.26/")
    @RequestMapping("/getPlayer/{year}/{TeamName}")
//    @PostMapping("/getPlayer/{year}/{TeamName}")
    @ResponseBody
    public List<History> getPlayer(@PathVariable String year, @PathVariable String TeamName) {
        System.out.println(year);
        System.out.println(TeamName);
        return historyDao.selectPlayer(year, TeamName);
    }
    @ApiImplicitParam(name = "PlayerName",value = "球员姓名",required = true)
    @ApiOperation(value = "获取某位球员历史数据")
    @CrossOrigin(origins = "http://139.224.40.26/")
    @RequestMapping("/getHistoryPlayer/{PlayerName}")
//    @GetMapping("/getHistoryPlayer/{PlayerName}")
    @ResponseBody
    public List<History> getHistoryPlayer(@PathVariable String PlayerName) {
        System.out.println(PlayerName);
        return historyDao.selectHistoryPlayer(PlayerName);
    }

    @ApiOperation(value = "获取所有新秀球员转型数据")
    @CrossOrigin(origins = "http://139.224.40.26/")
    @GetMapping("/getRookiePlayer")
    public List<RoleTransition> getRookiePlayer() {
        return roleTransitionDao.selectRookiePlayer();
    }
}
