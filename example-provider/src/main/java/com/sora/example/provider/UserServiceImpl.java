package com.sora.example.provider;

import com.sora.example.common.UserService;
import com.sora.example.common.model.User;

/**
 * 用户服务实现类
 * @author sora
 */
public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}