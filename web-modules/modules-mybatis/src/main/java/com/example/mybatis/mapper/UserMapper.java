package com.example.mybatis.mapper;

import com.example.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author BastetCat
 * @data 2019/7/10 23:12
 */
@Mapper
public interface UserMapper {
    /**
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 插入user
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 更新user
     * @param user
     * @return
     */
    int update(User user);
}
