package com.wwh.passjava.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wwh.passjava.channel.dao")
public class PassjavaChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaChannelApplication.class, args);
    }

}
