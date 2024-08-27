package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.entity.Borrow;

import java.util.List;

/**
 * @author Aaso
 * @version 1.0
 */
@Mapper
public interface BorrowMapper {
    @Select("SELECT * FROM borrow WHERE uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

    @Select("select * from borrow where bid = #{bid}")
    List<Borrow> getBorrowsByBid(int bid);

    @Select("select * from borrow where bid = #{bid} and uid = #{uid}")
    Borrow getBorrow(int uid, int bid);
}
