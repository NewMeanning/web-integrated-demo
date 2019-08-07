package com.example.mybatis.web;

import com.example.mybatis.domain.User;
import com.example.mybatis.domain.UserRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mybatis.service.UserService;

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

    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/all")
    public List<User>  findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
//    @RequestMapping(method = RequestMethod.POST)
//    public Integer insertUser(@RequestBody User user){
//        return userService.insertUser(user);
//    }

    @RequestMapping(method = RequestMethod.POST)
    public Integer insertUser(@RequestBody UserRelation userRelation){
        return userService.insertUserRelation(userRelation);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public Integer updateUser(@PathVariable String id,@RequestBody UserRelation userRelation){
        userRelation.setId(id);
        return userService.updateUserRelation(userRelation);
    }
}
