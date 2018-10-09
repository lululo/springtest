package com.example.springtest.web;

import com.example.springtest.common.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class helloworld {
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("he")
    public void show(){
        redisUtil.set("h","hkad");
        System.out.println(redisUtil);
    }
    @ResponseBody
    @RequestMapping("show")
    public String showString(){
        return "hello world";
    }
}
