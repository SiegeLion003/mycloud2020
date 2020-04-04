package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Description: 将restTemplate注入spring容器
 * FileName: ApplicationContextConfig
 * Author: cuihp
 * Date: 2020/4/4
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced /*使用@LoadBalanced 注解赋予了RestTemplate负载均衡的能力*/
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//applicationContext.xml  <bean id="" class="">
