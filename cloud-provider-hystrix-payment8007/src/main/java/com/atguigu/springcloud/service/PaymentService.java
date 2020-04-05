package com.atguigu.springcloud.service;

/**
 * Description:
 * FileName: PaymentService
 * Author: cuihp
 * Date: 2020/4/5
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymentInfo_TimeOut(Integer id);
}
