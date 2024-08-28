package org.example.controller;

// import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.example.entity.UserBorrowDetail;
import org.example.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;
import java.util.Collections;

/**
 * @author Aaso
 * @version 1.0
 */
@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    // //使用@HystrixCommand来指定备选方案
    // @HystrixCommand(fallbackMethod = "onError")
    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrowDetail(@PathVariable("uid") int uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }

    // //备选方案，这里直接返回空列表了
    // //注意参数和返回值要和上面的一致
    // UserBorrowDetail onError(int uid){
    //     return new UserBorrowDetail(null, Collections.emptyList());
    // }
}
