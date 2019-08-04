package com.example.mybatis.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author BastetCat
 * @data 2019/7/12 23:16
 */
@Configuration
@MapperScan("com.example.mybatis.mapper")
public class UserConfiguration {
}
