package com.example.mybatis.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @author BastetCat
 * @data 2019/7/10 22:54
 */
@Data
@Component
public class User {

    private String id;
    @Size(max = 50)
    private String name;
    @Max(value = 150,message = "年龄最大不超过150")
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDay;


}
