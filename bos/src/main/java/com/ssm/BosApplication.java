package com.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan(basePackages = "com.ssm.mapper")
@SpringBootApplication

public class BosApplication {

    public static void main(String[] args) {
        SpringApplication.run(BosApplication.class, args);
    }

}
