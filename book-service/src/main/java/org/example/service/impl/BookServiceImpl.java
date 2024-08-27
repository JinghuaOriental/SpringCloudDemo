package org.example.service.impl;

import org.example.entity.Book;
import org.example.mapper.BookMapper;
import org.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper bookMapper;

    @Override
    public Book getBookById(int bookId) {
        return bookMapper.findBookByBookId(bookId);
    }
}
