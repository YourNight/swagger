package com.liu.springboot.study.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhaolong on 2018/5/14.
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = {"","/donkey"},method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @ApiOperation(value = "说些话",notes = "看看这是什么")
    @ApiImplicitParam(name = "thing",value = "说的话",defaultValue = "zhendejiade 默认",required = false,dataType = "Long")
    @RequestMapping(value = "/say/{thing}",method = RequestMethod.GET)
    public String say(@PathVariable String thing){
        log.debug("my name is "+thing);
        System.out.println("dasdasd");
        return "my name is "+thing;
    }
}
