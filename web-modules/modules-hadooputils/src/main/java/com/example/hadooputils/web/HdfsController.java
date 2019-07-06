package com.example.hadooputils.web;

import com.example.hadooputils.service.HdfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BastetCat
 * @data 2019/7/6 18:16
 */

@RestController
@RequestMapping("/hdfs")
public class HdfsController {


    @Autowired
    private HdfsService service;

    @GetMapping(value = "/getMessage")
    public String getMessage(){
        return service.getMessage();
    }
}
