package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: 支付8002
 * FileName: paymentMain8002
 * Author: cuihp
 * Date: 2020/4/3
 */
@SpringBootApplication
@EnableEurekaClient
public class paymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8002.class,args);
    }
}
