package com.example.springtest.web;

import com.example.springtest.common.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("he")
    public void show(){
        System.out.println(redisUtil);
    }
}
