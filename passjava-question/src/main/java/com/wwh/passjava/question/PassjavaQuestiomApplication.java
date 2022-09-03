package com.wwh.passjava.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wwh.passjava.question.dao")
public class PassjavaQuestiomApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaQuestiomApplication.class, args);
    }

}
