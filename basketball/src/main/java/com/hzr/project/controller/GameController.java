package com.hzr.project.controller;

import com.hzr.project.dao.LplGameDao;
import com.hzr.project.dao.LplPlayerDao;
import com.hzr.project.model.LplGame;
import com.hzr.project.model.LplPlayer;
import com.hzr.project.model.Text;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = "LPL模块")
@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "http://139.224.40.26/")
public class GameController {
    @Autowired
    LplGameDao lplGameDao;
    @Autowired
    LplPlayerDao lplPlayerDao;


    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季的比赛数据")
    @GetMapping("/getGame/{year}/{season}")
    public List<LplGame> getGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectLplGame(year, season);
    }

    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季的球员个人数据")
    @GetMapping("/getPlayer/{year}/{season}")
    public List<LplPlayer> getPlayer(@PathVariable String year, @PathVariable String season) {
        return lplPlayerDao.SelectLplPlayer(year, season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高击杀数的球员数据")
    @GetMapping("/getTopKillPlayer/{year}/{season}")
    public List<LplPlayer> getTopKillPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopKillPlayer(year,season);
    }

    /**
     *
     * @param year
     * @param season
     * @return
     */
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高助攻数的球员数据")
    @GetMapping("/getTopAssPlayer/{year}/{season}")
    public List<LplPlayer> getTopAssPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopAssPlayer(year,season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高KDA的球员数据")
    @GetMapping("/getTopKDAPlayer/{year}/{season}")
    public List<LplPlayer> getTopKDAPlayer(@PathVariable String year, @PathVariable String season) {
        return  lplPlayerDao.SelectTopKDAPlayer(year,season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高击杀比例的队伍数据")
    @GetMapping("/getTopRateGame/{year}/{season}")
    public List<LplGame> getTopRateGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopRateGame(year, season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高击杀数的队伍数据")
    @GetMapping("/getTopKillGame/{year}/{season}")
    public List<LplGame> getTopKillGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopKillGame(year, season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季具有最高收益数的队伍数据")
    @GetMapping("/getTopMoneyGame/{year}/{season}")
    public List<LplGame> getTopMoneyGame(@PathVariable String year, @PathVariable String season) {
        return lplGameDao.selectTopMoneyGame(year, season);
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季最佳的三支队伍")
    @GetMapping("/getTop3Game/{year}/{season}")
    public  List<LplGame> getTop3Game (@PathVariable String year, @PathVariable String season) {
        List<LplGame> res= lplGameDao.selectTopRateGame(year, season);
        res.addAll(lplGameDao.selectTopKillGame(year, season));
        res.addAll(lplGameDao.selectTopMoneyGame(year, season));
        return res;
    }
    @ApiImplicitParams({@ApiImplicitParam(name = "year",value = "年份",required = true),@ApiImplicitParam(name = "season",value = "赛季",required = true)})
    @ApiOperation(value = "获取某年赛季最佳的三位队员")
    @GetMapping("getTop3Player/{year}/{season}")
    public List<LplPlayer> getTop3Player (@PathVariable String year, @PathVariable String season) {
        List<LplPlayer> res= lplPlayerDao.SelectTopKillPlayer(year, season);
        res.addAll(lplPlayerDao.SelectTopAssPlayer(year, season));
        res.addAll(lplPlayerDao.SelectTopKDAPlayer(year, season));
        return res;
    }










    }
