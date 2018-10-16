package com.example.springtest.web;

import com.example.springtest.common.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class helloworld {
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("he")
    public void show(){
        redisUtil.set("h","hkad");
        System.out.println(redisUtil);
    }

    @RequestMapping("sucess")
    public String showString(Map<String,Object> map){
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "sucess";
    }
}
