package com.sora.example.consumer;

import com.sora.example.common.UserService;
import com.sora.example.common.model.User;
import com.sora.sorarpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 * @author sora
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("MckennaSora");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
        short number = userService.getNumber();
        System.out.println(number);
    }
}
