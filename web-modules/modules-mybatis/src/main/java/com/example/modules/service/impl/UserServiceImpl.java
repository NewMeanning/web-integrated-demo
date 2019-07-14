package com.example.modules.service.impl;


import com.example.modules.domain.User;
import com.example.modules.mapper.UserMapper;
import com.example.modules.service.UserService;
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
