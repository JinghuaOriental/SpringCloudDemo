package org.example.service.impl;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    public static int invokeCount = 1;

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int studentId) {
        System.out.println("调用次数：" + (invokeCount++));
        return userMapper.findUserByStudentId(studentId);
    }
}
