package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * Description:
 * FileName: OrderController
 * Author: cuihp
 * Date: 2020/4/4
 */
@RestController
@Slf4j
public class OrderController {
    /**
     * restTemplate对httpClient进行了封装
     *
     * 官网地址
     * https://docs. spring.io/spring framework/docs/5.2.2.RELEASE/javadoc api/org/springframework/web/client/RestTemplate.html
     *
     * 使用restTemplate访问restful接口非常的简单粗暴无脑。
     * (url, requestMap, ResponseBean.class)这三个参数分别代表
     * REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     * @return
     */

    private static final String payment_url = "http://cloud-payment-service";/*这里的服务名称大小写都可以没有影响*/
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create( Payment payment){

        return restTemplate.postForObject(payment_url+"payment/create", payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(payment_url+"/payment/get/"+id,CommonResult.class);
    }
}
