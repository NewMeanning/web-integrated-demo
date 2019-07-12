package com.example.mybatis.service;

import com.example.mybatis.domain.User;

import java.util.List;
import java.util.Map;

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

    Map<String,String> test();
}
