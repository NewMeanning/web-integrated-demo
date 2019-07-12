package com.example.mybatis.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mybatis.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @author BastetCat
 * @data 2019/7/10 23:15
 */
@RestController
@RequestMapping("/mybatis/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public JSONArray findAll(){
        List<User> userList = userService.findAll();
        return JSONArray.parseArray(JSON.toJSONString(userList));
    }
    @GetMapping("/test")
    public Map<String,String> test(){
        return userService.test();
    }
}
