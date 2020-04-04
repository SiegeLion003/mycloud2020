package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * FileName: ConsulOrderController
 * Author: cuihp
 * Date: 2020/4/4
 */
@RestController
@Slf4j
public class ConsulOrderController {

    private static final String invockUrl= "http://cloud-provider-payment-consul";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentConsul(){
        String forObject = restTemplate.getForObject(invockUrl + "/payment/consul", String.class);
        return forObject;
    }
}
