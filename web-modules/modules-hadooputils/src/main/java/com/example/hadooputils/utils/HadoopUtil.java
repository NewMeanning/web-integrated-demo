package com.example.hadooputils.utils;


import org.apache.hadoop.conf.Configuration;

/**
 * @author BastetCat
 * @data 2019/7/6 17:55
 */

public class HadoopUtil {

    private static String HDFSPATH;

    /**
     * 配置路径
     * @param path
     */
    public static void setConf(String path) {
        HDFSPATH = path;
    }

    /**
     * 获取HDFS配置信息
     * @return
     */
    private static Configuration getConfiguration() {
        Configuration configuration = new Configuration();
        configuration.set("fs.defaultFS", HDFSPATH);
        return configuration;
    }

}
