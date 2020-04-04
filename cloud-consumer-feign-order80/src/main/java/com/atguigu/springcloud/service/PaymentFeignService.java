package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * Description:
 * FileName: PaymentFeignService
 * Author: cuihp
 * Date: 2020/4/5
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    @PostMapping("/payment/create")
    CommonResult create(@RequestBody Payment payment);

    @GetMapping("payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
