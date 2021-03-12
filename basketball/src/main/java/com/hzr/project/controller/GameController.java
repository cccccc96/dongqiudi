package com.hzr.project.controller;

import com.hzr.project.dao.LplGameDao;
import com.hzr.project.dao.LplPlayerDao;
import com.hzr.project.model.LplGame;
import com.hzr.project.model.LplPlayer;
import com.hzr.project.model.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    LplGameDao lplGameDao;
    @Autowired
    LplPlayerDao lplPlayerDao;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getGame/{year}/{season}")
    public List<LplGame> getGame(@PathVariable String year, @PathVariable String season){
        return lplGameDao.selectLplGame(year,season);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getPlayer/{year}/{season}")
    public List<LplPlayer> getPlayer(@PathVariable String year, @PathVariable String season){
        return lplPlayerDao.SelectLplPlayer(year,season);
    }

}
