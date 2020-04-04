package com.atguigu.springcloud.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;

/**
 * Description:
 * FileName: PaymentServiceImpl
 * Author: cuihp
 * Date: 2020/4/4
 */
@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
