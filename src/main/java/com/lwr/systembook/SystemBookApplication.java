package com.lwr.systembook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapperScan注解指定当前项目中的Mapper借口路径的位置,在项目q启动的时候会自动加载所有的接口文件
@MapperScan("com.lwr.systembook.mapper")
public class SystemBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemBookApplication.class, args);
    }

}
