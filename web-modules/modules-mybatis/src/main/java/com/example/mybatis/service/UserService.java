package com.example.mybatis.service;

import com.example.mybatis.domain.User;
import com.example.mybatis.domain.UserRelation;

import java.util.List;

/**
 * @author BastetCat
 * @data 2019/7/10 23:16
 */
public interface UserService {
    /**
     * 获取所有用户
     * @return
     */
    List<User> findAll();

    int insertUser(User user);

    int insertUserRelation(UserRelation userRelation);

    int updateUserRelation(UserRelation userRelation);

}
