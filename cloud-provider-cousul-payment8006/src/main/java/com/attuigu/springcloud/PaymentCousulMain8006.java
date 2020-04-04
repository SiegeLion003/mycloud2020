package com.attuigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * FileName: paymentCousulMain8006
 * Author: cuihp
 * Date: 2020/4/4
 */
@SpringBootApplication
//@EnableDiscoveryClient/*该注解用向使用 consul或者zookeeper作为注册中心时 获取注册服务信息*/
public class PaymentCousulMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentCousulMain8006.class,args);
    }
}
