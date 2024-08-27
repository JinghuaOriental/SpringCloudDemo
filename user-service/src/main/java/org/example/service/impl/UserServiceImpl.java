package org.example.service.impl;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int studentId) {
        return userMapper.findUserByStudentId(studentId);
    }
}
