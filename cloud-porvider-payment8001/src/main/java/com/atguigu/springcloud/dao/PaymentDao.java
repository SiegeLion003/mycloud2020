package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.springcloud.entities.Payment;

/**
 * Description:
 * FileName: PaymentDao
 * Author: cuihp
 * Date: 2020/4/4
 */
@Mapper
public interface PaymentDao {
    public  int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
