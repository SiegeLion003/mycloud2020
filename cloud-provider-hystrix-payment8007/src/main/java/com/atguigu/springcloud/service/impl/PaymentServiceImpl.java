package com.atguigu.springcloud.service.impl;

import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Service;

import com.atguigu.springcloud.service.PaymentService;

/**
 * Description:
 * FileName: PaymentServiceImpl
 * Author: cuihp
 * Date: 2020/4/5
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    /**
     * 正常访问，肯定OK
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "线程池:  "+Thread.currentThread().getName()+"  paymentInfo_OK,id:  "+id+"\t"+"O(∩_∩)O哈哈~";
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
//    })
    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        //int age = 10/0;
        try { TimeUnit.MILLISECONDS.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:  "+Thread.currentThread().getName()+" id:  "+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时(秒): ";
    }

    public String paymentInfo_TimeOutHandler(Integer id)
    {
        return "线程池:  "+Thread.currentThread().getName()+"  8007系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }
}
