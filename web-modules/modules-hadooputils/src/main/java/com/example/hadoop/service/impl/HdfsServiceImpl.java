package com.example.hadoop.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.hadoop.service.HdfsService;
import com.example.hadoop.utils.HadoopUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
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

    @Override
    public String mkDir(String dirName) {
        boolean mkdir = false;
        try {
            HadoopUtil.getFileSystem();
            HadoopUtil.mkdir(dirName);
        } catch (IOException e) {
            //e.printStackTrace();
            return "失败";
        }finally {
            try {
                HadoopUtil.closeFilseSystem();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (mkdir){
            return "success";
        }else {
            return "fail";
        }
    }
}
