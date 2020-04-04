package com.atguigu.springcloud.config;

import feign.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 * FileName: FeignConfig
 * Author: cuihp
 * Date: 2020/4/5
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
