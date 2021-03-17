package com.hzr.project.controller;

import com.hzr.project.dao.HistoryDao;
import com.hzr.project.dao.RoleTransitionDao;
import com.hzr.project.model.History;
import com.hzr.project.model.RoleTransition;
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
@RequestMapping("/ball")
public class BallController {
    @Autowired
    private HistoryDao historyDao;
    @Autowired
    private RoleTransitionDao roleTransitionDao;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/getPlayer/{year}/{TeamName}")
    @ResponseBody
    public List<History> getPlayer(@PathVariable String year, @PathVariable String TeamName) {
        System.out.println(year);
        System.out.println(TeamName);
        return historyDao.selectPlayer(year, TeamName);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/getHistoryPlayer/{PlayerName}")
    @ResponseBody
    public List<History> getHistoryPlayer(@PathVariable String PlayerName) {
        System.out.println(PlayerName);
        return historyDao.selectHistoryPlayer(PlayerName);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getRookiePlayer")
    public List<RoleTransition> getRookiePlayer() {
        return roleTransitionDao.selectRookiePlayer();
    }
}
