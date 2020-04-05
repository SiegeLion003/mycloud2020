package com.atguigu.springcloud.service.impl;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.service.PaymentHystrixService;

/**
 * Description:
 * FileName: paymentHystrixServiceImpl
 * Author: cuihp
 * Date: 2020/4/5
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id){
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id){
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
