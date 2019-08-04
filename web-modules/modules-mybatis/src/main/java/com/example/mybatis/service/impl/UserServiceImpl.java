package com.example.mybatis.service.impl;


import com.example.mybatis.domain.User;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


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

}
