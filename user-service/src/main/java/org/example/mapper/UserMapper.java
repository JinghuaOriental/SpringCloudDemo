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

    @Select("SELECT * FROM student WHERE student_id = #{studentId}")
    User findUsernameByStudentId(@Param("studentId") int studentId);
}
