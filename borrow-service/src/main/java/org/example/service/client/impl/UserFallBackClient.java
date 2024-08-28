package org.example.service.client.impl;

import org.example.entity.User;
import org.example.service.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Aaso
 * @version 1.0
 */
@Component
public class UserFallBackClient implements UserClient {
    @Override
    public User getUserById(int uid) {
        return new User(0, "这是补救措施", "男", 0);
    }
}
