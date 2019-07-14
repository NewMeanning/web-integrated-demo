package com.example.modules.service;

import com.example.modules.domain.User;

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
