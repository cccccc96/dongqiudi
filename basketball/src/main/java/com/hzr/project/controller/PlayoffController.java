package com.hzr.project.controller;

import com.hzr.project.dao.PlayerDao;
import com.hzr.project.dao.TeamDao;
import com.hzr.project.dao.TextDao;
import com.hzr.project.model.Player;
import com.hzr.project.model.Team;
import com.hzr.project.model.Text;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "季后赛模块")
@RestController
@RequestMapping("/playoff")
public class PlayoffController {
    @Autowired
    TextDao textDao;
    @Autowired
    TeamDao teamDao;
    @Autowired
    PlayerDao playerDao;

    @CrossOrigin(origins = "http://101.132.45.226")
    @GetMapping("/getText/{winner}/{loser}")
    public Text getText(@PathVariable String winner,@PathVariable String loser){
        return textDao.selectByTeam(winner, loser);
    }

    @CrossOrigin(origins = "http://101.132.45.226")
    @GetMapping("/getTeam/{winner}/{loser}")
    public List<Team> getTeam(@PathVariable String winner, @PathVariable String loser){
        return teamDao.selectTeam(winner,loser);
    }

    @CrossOrigin(origins = "http://101.132.45.226")
    @GetMapping("/getPlayer/{winner}/{loser}")
    public List<Player> getPlayer(@PathVariable String winner , @PathVariable String loser){
        return playerDao.getPlayer(winner,loser);
    }
}
