package com.example.mybatis.service.impl;


import com.example.mybatis.domain.User;
import com.example.mybatis.domain.UserRelation;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


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
    public int insertUser(User user) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        user.setId(uuid);
        return userMapper.insert(user);
    }

    @Override
    public int insertUserRelation(UserRelation userRelation) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        userRelation.setId(uuid);
        return userMapper.insert(userRelation);
    }

    @Override
    public int updateUserRelation(UserRelation userRelation) {
        return userMapper.update(userRelation);
    }
}
