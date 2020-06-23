package com.meimei.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBUtil {


    private static DruidDataSource  druidDataSource;

//    public static void main(String[] args) {
//        JdbcTemplate jdbcTemplate=new JdbcTemplate(getDateSource());
//        System.out.println(jdbcTemplate);
//    }
    static {
        try {
            Properties properties=new Properties();
            InputStream is=DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(is);
            druidDataSource=new DruidDataSource();
            druidDataSource.setUsername(properties.getProperty("jdbc.username"));
            druidDataSource.setPassword(properties.getProperty("jdbc.password"));
            druidDataSource.setUrl(properties.getProperty("jdbc.url"));
            druidDataSource.setDriverClassName(properties.getProperty("jdbc.driverClassName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static DruidDataSource getDateSource(){
        return druidDataSource;
    }
}
