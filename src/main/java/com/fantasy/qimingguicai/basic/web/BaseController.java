package com.fantasy.qimingguicai.basic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
    @ResponseBody
    @RequestMapping("/hello2")
    public String hello(){
        return "hi";
    }
}
