package com.example.swmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SWMM Online Application
 * 在线水文模拟平台后端服务
 */
@SpringBootApplication
@MapperScan("com.example.swmm.repository")
public class SwmmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwmmApplication.class, args);
    }
}
