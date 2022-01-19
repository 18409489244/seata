package com.lyf.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther 刘耀福
 * @create 2022-01-17
 */
@EnableFeignClients
@SpringBootApplication
public class SeataOrderMainApp2001
{
    public static void main(String[] args)
    {
        SpringApplication.run(SeataOrderMainApp2001.class, args);
    }
}
