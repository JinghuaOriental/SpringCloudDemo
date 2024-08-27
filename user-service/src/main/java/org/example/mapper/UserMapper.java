package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.entity.User;

/**
 * @author Aaso
 * @version 1.0
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM student WHERE uid = #{uid}")
    User findUserByStudentId(@Param("uid") int uid);
    // User findUserByStudentId(@Param("uid") int studentId); // 注意两者必须相同
}
