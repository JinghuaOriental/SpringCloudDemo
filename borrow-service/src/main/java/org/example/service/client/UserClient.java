package org.example.service.client;

import org.example.entity.User;
import org.example.service.client.impl.UserFallBackClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aaso
 * @version 1.0
 */
@FeignClient(name = "userservice", fallback = UserFallBackClient.class)
public interface UserClient {
    @RequestMapping("/user/{uid}")
    User getUserById(@PathVariable("uid") int uid);
}
