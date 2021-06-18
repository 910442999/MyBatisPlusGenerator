package com.yc.asyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.asyy.mapper")
public class MyBatisPlusGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPlusGeneratorApplication.class, args);
    }

}
