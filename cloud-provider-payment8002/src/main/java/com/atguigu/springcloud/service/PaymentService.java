package com.atguigu.springcloud.service;

import org.apache.ibatis.annotations.Param;

import com.atguigu.springcloud.entities.Payment;

/**
 * Description:
 * FileName: PaymentService
 * Author: cuihp
 * Date: 2020/4/4
 */
public interface PaymentService {
    public  int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
