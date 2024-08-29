package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.entity.Book;
import org.example.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Resource;

/**
 * @author Aaso
 * @version 1.0
 */
@RestController
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/book/{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId, HttpServletRequest request) {
        System.out.println(request.getHeader("Test"));
        return bookService.getBookById(bookId);
    }
}
