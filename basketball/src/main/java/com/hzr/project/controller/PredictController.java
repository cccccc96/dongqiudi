package com.hzr.project.controller;

import com.hzr.project.dao.IRecord;
import com.hzr.project.model.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Api(tags = "数据预测模块")
@Controller
public class PredictController {
    @Autowired
    private IRecord iRecord;

    public void StringParse(StringBuilder S1) {
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == '\\') {
                S1.setCharAt(i, '/');
            }
        }
    }

    @RequestMapping(value = "predict")
    public String Predict(@RequestParam(name = "date") String date, @RequestParam(name = "check_image") String[] imgs, Model model) {
        Map<String, String> map = new HashMap<>();
        String filepath = "img\\tupian\\tupian\\";
        map.put("Philadelphia 76ers", filepath + "76人.jpg");
        map.put("Chicago Bulls", filepath + "公牛.jpg");
        map.put("Atlanta Hawks", filepath + "老鹰.jpg");
        map.put("Indiana Pacers", filepath + "步行者？.jpg");
        map.put("Orlando Magic", filepath + "魔术.jpg");
        map.put("Boston Celtics", filepath + "绿军.jpg");
        map.put("New York Knicks", filepath + "纽约.jpg");
        map.put("Toronto Raptors", filepath + "猛龙.jpg");
        map.put("Brooklyn Nets", filepath + "篮网.jpg");
        map.put("Miami Heat", filepath + "热火.jpg");
        map.put("Charlotte Hornets", filepath + "黄蜂.jpg");
        map.put("Washington Wizards", filepath + "奇才.jpg");
        map.put("Milwaukee Bucks", filepath + "雄鹿.jpg");
        map.put("Detroit Pistons", filepath + "Detroit%20pistons.jpg");
        map.put("Cleveland Cavaliers", filepath + "骑士.jpg");
        map.put("Denver Nuggets", filepath + "denver%20nuggets.jpg");
        map.put("Houston Rockets", filepath + "火箭.jpg");
        map.put("Minnesota Timberwolves", filepath + "minnesota%20timberwolves（不认识）.jpg");
        map.put("Portland Trail Blazers", filepath + "portland%20trail%20blazers.jpg");
        map.put("Golden State Warriors", filepath + "勇士.jpg");
        map.put("Sacramento Kings", filepath + "国王.jpg");
        map.put("Phoenix Suns", filepath + "太阳.jpg");
        map.put("Dallas Mavericks", filepath + "小牛？.jpg");
        map.put("Los Angeles Clippers", filepath + "快船.jpg");
        map.put("Los Angeles Lakers", filepath + "湖人.jpg");
        map.put("New Orleans Pelicans", filepath + "鹈鹕.jpg");
        map.put("San Antonio Spurs", filepath + "马刺.jpg");
        map.put("Oklahoma City Thunder", filepath + "雷霆.jpg");
        map.put("Utah Jazz", filepath + "爵士.jpg");
        map.put("Memphis Grizzlies", filepath + "灰熊？.jpg");
        String t1 = imgs[0];
        String t2 = imgs[1];
        Optional<Result> result = Optional.ofNullable(iRecord.search(t1, t2, date));
        if (!result.isPresent()) {
            return "index";
        }
        String img_1 = map.get(result.get().getWteam());
        String img_2 = map.get(result.get().getLteam());
        StringBuilder S1 = new StringBuilder(img_1);
        StringBuilder S2 = new StringBuilder(img_2);
        StringParse(S1);
        StringParse(S2);
        model.addAttribute("team1", result.get().getWteam());
        model.addAttribute("team2", result.get().getLteam());
        model.addAttribute("probability", result.get().getProbability());
        model.addAttribute("date", date);
        model.addAttribute("img_1", S1.toString().trim());
        model.addAttribute("img_2", S2.toString().trim());
        return "display";
    }

    @RequestMapping(value = "index2")
    public String History() {
        return "index2";
    }
}
