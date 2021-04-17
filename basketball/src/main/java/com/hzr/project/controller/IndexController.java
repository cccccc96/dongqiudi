package com.hzr.project.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Api(tags = "项目首页")
@Controller
public class IndexController {

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }
}
