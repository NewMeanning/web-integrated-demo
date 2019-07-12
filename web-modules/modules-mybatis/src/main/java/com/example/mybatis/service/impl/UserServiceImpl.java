package com.example.mybatis.service.impl;


import com.example.mybatis.domain.User;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author BastetCat
 * @data 2019/7/12 21:56
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public Map<String, String> test() {
        HashMap<String,String> map = new HashMap<>();
        map.put("小猪","笨蛋");
        return map;
    }
}
