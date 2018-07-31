package com.liu.springboot.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuhaolong on 2018/5/15.
 */
@Controller
public class HtmlController {
    @RequestMapping("haha")
    public String index(ModelMap map){
        System.out.println("asdasd");
        map.addAttribute("host","http://baidu.com");
        return "aaa";
    }

}
