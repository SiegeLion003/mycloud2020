package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;

/**
 * Description:
 * FileName: PaymentController
 * Author: cuihp
 * Date: 2020/4/4
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("*******payment服务端口为:{}---插入结果:{}",serverPort,i);
        if (i>0){
            return new CommonResult<>(200,"插入数据库成功,端口号为:"+serverPort,i);
        }
        return new CommonResult<>(444,"插入数据库失败,端口号为:"+serverPort,null);
    }

    @GetMapping("payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
//        System.out.println(id);
        System.out.println("hahah");
        if (null != paymentById){
            return new CommonResult(200,"查询成功,端口号为:"+serverPort,paymentById);
        }
        return new CommonResult(444,"插入失败,端口号为:"+serverPort,null);
    }

}
