package com.example.hadooputils.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.hadooputils.service.HdfsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author BastetCat
 * @data 2019/7/6 18:24
 */
@Service
public class HdfsServiceImpl implements HdfsService {

    @Override
    public String getMessage() {
        HashMap<String, String> map = new HashMap<>();
        map.put("11","11");
        return JSONObject.toJSONString(map);
    }
}
