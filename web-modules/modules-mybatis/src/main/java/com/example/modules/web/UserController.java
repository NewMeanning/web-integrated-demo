package com.example.modules.web;

import com.example.modules.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.modules.service.UserService;

import java.util.List;

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
    public List<User>  findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }
}
