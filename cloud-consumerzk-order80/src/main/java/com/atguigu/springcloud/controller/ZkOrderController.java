package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * FileName: ZkOrderController
 * Author: cuihp
 * Date: 2020/4/4
 */
@RestController
@Slf4j
public class ZkOrderController {

    private static final String invoke_url ="http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        String forObject = restTemplate.getForObject(invoke_url + "/payment/zk", String.class);
        return forObject;
    }
}
