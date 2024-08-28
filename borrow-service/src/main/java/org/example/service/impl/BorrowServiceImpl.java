package org.example.service.impl;

import org.example.entity.Book;
import org.example.entity.Borrow;
import org.example.entity.User;
import org.example.entity.UserBorrowDetail;
import org.example.mapper.BorrowMapper;
import org.example.service.BorrowService;
import org.example.service.client.BookClient;
import org.example.service.client.UserClient;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aaso
 * @version 1.0
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Resource
    UserClient userClient;

    @Resource
    BookClient bookClient;

    @Resource
    BorrowMapper borrowMapper;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = borrowMapper.getBorrowsByUid(uid);
        // //RestTemplate支持多种方式的远程调用
        // RestTemplate template = new RestTemplate();
        //这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取User信息
        // User user = restTemplate.getForObject("http://userservice/user/"+uid, User.class);
        User user = userClient.getUserById(uid);
        //获取每一本书的详细信息
        List<Book> bookList = borrow
                .stream()
                .map(b -> bookClient.getBookById(b.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
