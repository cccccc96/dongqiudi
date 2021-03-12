package com.hzr.project.controller;

import com.hzr.project.dao.PlayerDao;
import com.hzr.project.dao.TeamDao;
import com.hzr.project.dao.TextDao;
import com.hzr.project.model.Player;
import com.hzr.project.model.Team;
import com.hzr.project.model.Text;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playoff")
public class PlayoffController {
    @Autowired
    TextDao textDao;
    @Autowired
    TeamDao teamDao;
    @Autowired
    PlayerDao playerDao;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getText/{winner}/{loser}")
    public Text getText(@PathVariable String winner,@PathVariable String loser){
        Text text=textDao.selectByTeam(winner,loser);
        return text;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getTeam/{winner}/{loser}")
    public List<Team> getTeam(@PathVariable String winner, @PathVariable String loser){
        return teamDao.selectTeam(winner,loser);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getPlayer/{winner}/{loser}")
    public List<Player> getPlayer(@PathVariable String winner , @PathVariable String loser){
        return playerDao.getPlayer(winner,loser);
    }
}