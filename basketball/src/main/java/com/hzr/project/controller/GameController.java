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
@CrossOrigin(origins = "http://localhost:3000")
public class GameController {
    @Autowired
    LplGameDao lplGameDao;
    @Autowired
    LplPlayerDao lplPlayerDao;



    @GetMapping("/getGame/{year}/{season}")
    public List<LplGame> getGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectLplGame(year, season);
    }


    @GetMapping("/getPlayer/{year}/{season}")
    public List<LplPlayer> getPlayer(@PathVariable String year, @PathVariable String season) {
        return lplPlayerDao.SelectLplPlayer(year, season);
    }

    @GetMapping("/getTopKillPlayer/{year}/{season}")
    public List<LplPlayer> getTopKillPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopKillPlayer(year,season);
    }

    @GetMapping("/getTopAssPlayer/{year}/{season}")
    public List<LplPlayer> getTopAssPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopAssPlayer(year,season);
    }

    @GetMapping("/getTopKDAPlayer/{year}/{season}")
    public List<LplPlayer> getTopKDAPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopKDAPlayer(year,season);
    }

    @GetMapping("/getTopRateGame/{year}/{season}")
    public List<LplGame> getTopRateGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopRateGame(year, season);
    }

    @GetMapping("/getTopKillGame/{year}/{season}")
    public List<LplGame> getTopKillGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopKillGame(year, season);
    }

    @GetMapping("/getTopMoneyGame/{year}/{season}")
    public List<LplGame> getTopMoneyGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopMoneyGame(year, season);
    }

    @GetMapping("/getTop3Game/{year}/{season}")
    public  List<LplGame> getTop3Game (@PathVariable String year, @PathVariable String season) {
        List<LplGame> res= lplGameDao.selectTopRateGame(year, season);
        res.addAll(lplGameDao.selectTopKillGame(year, season));
        res.addAll(lplGameDao.selectTopMoneyGame(year, season));
        return res;
    }

    @GetMapping("getTop3Player/{year}/{season}")
    public List<LplPlayer> getTop3Player (@PathVariable String year, @PathVariable String season) {
        List<LplPlayer> res= lplPlayerDao.SelectTopKillPlayer(year, season);
        res.addAll(lplPlayerDao.SelectTopAssPlayer(year, season));
        res.addAll(lplPlayerDao.SelectTopKDAPlayer(year, season));
        return res;
    }










    }
