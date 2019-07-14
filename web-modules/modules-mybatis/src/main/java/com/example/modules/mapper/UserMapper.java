package com.example.modules.mapper;

import com.example.modules.domain.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author BastetCat
 * @data 2019/7/10 23:12
 */
@Mapper
public interface UserMapper {

    List<User> selectAll();
}