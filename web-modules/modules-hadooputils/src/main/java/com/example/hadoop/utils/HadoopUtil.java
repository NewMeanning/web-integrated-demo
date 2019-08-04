package com.example.hadoop.utils;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @author BastetCat
 * @data 2019/7/6 17:55
 */

public class HadoopUtil {

    private static String HDFSPATH;

    private static  FileSystem FILESYSTEM;
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

    public static void getFileSystem() throws IOException {
       FILESYSTEM = FileSystem.get(getConfiguration());
    }

    public static void closeFilseSystem() throws IOException {
        FILESYSTEM.close();
    }

    public static boolean mkdir(String dirName) throws IOException {
        return FILESYSTEM.mkdirs(new Path(dirName));
    }

}
