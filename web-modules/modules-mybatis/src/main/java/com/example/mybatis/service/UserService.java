package com.example.mybatis.service;

import com.example.mybatis.domain.User;

import java.util.List;

/**
 * @author BastetCat
 * @data 2019/7/10 23:16
 */
public interface UserService {
    /**
     *
     * @return
     */
    List<User> findAll();

}
