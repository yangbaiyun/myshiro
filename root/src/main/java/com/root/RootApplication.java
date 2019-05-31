package com.root;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.root.mapper")
public class RootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class, args);
    }

}
