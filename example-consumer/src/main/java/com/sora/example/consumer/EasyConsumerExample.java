package com.sora.example.consumer;

import com.sora.example.common.UserService;
import com.sora.example.common.model.User;

/**
 * 简易服务消费者示例
 * @author sora
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // todo 需要获取 UserService 的实现类对象
        UserService userService = new UserServiceProxy();;
        User user = new User();
        user.setName("sora");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
