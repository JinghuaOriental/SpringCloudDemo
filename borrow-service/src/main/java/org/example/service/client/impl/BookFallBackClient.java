package org.example.service.client.impl;

import org.example.entity.Book;
import org.example.entity.User;
import org.example.service.client.BookClient;
import org.example.service.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Aaso
 * @version 1.0
 */
@Component
public class BookFallBackClient implements BookClient {
    @Override
    public Book getBookById(int uid) {
        return new Book(0, "这是补救措施", 0.0, "书籍描述");
    }
}
