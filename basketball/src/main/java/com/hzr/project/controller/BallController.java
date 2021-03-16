package com.hzr.project.controller;

import com.hzr.project.dao.HistoryDao;
import com.hzr.project.dao.RoleTransitionDao;
import com.hzr.project.model.History;
import com.hzr.project.model.RoleTransition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/getPlayer/{year}/{TeamName}")
    public List<History> getPlayer(@PathVariable String year, @PathVariable String TeamName) {
        return historyDao.selectPlayer(year, TeamName);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getRookiePlayer")
    public List<RoleTransition> getRookiePlayer() {
        return roleTransitionDao.selectRookiePlayer();
    }
}
