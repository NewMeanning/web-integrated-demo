package com.example.modules.web;

import com.example.modules.service.HdfsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "{dirName}")
    public String mkDir(@PathVariable String dirName){
        return service.mkDir(dirName);
    }
}
