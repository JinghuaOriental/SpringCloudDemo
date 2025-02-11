package org.example.service.client;

import org.example.entity.Book;
import org.example.service.client.impl.BookFallBackClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aaso
 * @version 1.0
 */
@FeignClient(name = "bookservice", fallback = BookFallBackClient.class)
public interface BookClient {
    @RequestMapping("/book/{bid}")
    Book getBookById(@PathVariable("bid") int bid);
}
