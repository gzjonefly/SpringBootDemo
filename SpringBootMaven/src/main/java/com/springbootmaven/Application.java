package com.springbootmaven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author guozijian
 * @date 2016/9/3 10:06
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
//@MapperScan({"com.springbootmaven.dao.mapper", "com.kanzhun.dz.bi.dao.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
