package org.example.controller;

import org.example.entity.UserBorrowDetail;
import org.example.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrowDetail(@PathVariable("uid") int uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }
}
