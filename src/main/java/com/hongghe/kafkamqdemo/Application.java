package com.hongghe.kafkamqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动文件
 *
 * @author hongghe
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
