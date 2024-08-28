package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid") int uid) {
        return userService.getUserById(uid);
    }
}
