package com.example.hadooputils.conf;

import com.example.hadooputils.utils.HadoopUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
@Component
public class HdfsConfig {

    @Value("${hdfs.path}")
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @PostConstruct
    public void init(){
        HadoopUtil.setConf(path);
    }
}
