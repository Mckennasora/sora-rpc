package com.sora.example.common;

import com.sora.example.common.model.User;

/**
 * @author sora
 */
public interface UserService {

    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);
}