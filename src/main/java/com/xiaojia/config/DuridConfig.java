package com.xiaojia.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 为了让alibab的连接池的一下配置和springboot匹配
 * @author 黄仕杰
 * Created by 黄仕杰 on 2019/3/9.
 */
@Configuration
public class DuridConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
}
