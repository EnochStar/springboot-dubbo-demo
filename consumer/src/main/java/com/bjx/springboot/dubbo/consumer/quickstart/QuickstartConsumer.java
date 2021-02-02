package com.bjx.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjx.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author EnochStar
 * @title: QuickstartConsumer
 * @projectName springboot-dubbo-demo
 * @description: TODO
 * @date 2021/2/2 21:47
 */
@Component
public class QuickstartConsumer{
    @Reference
    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }

}
