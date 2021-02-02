package com.bjx.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjx.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author EnochStar
 * @title: QuickstartServiceImpl
 * @projectName springboot-dubbo-demo
 * @description: TODO
 * @date 2021/2/2 21:39
 */
@Component
// 注意要用dubbo的Service
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message = " + message;
    }
}
