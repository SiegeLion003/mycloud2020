package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 * FileName: PaymentHystrixMain8007
 * Author: cuihp
 * Date: 2020/4/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixMain8007 {


    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8007.class,args);
    }
}
