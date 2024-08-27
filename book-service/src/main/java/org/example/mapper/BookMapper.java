package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Book;

/**
 * @author Aaso
 * @version 1.0
 */
@Mapper
public interface BookMapper {
    @Select("SELECT * FROM book WHERE book_id = #{bookId}")
    Book findBookByBookId(@Param("bookId") int bookId);
}
