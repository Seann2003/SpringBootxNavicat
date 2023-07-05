package com.example.demo.student.mapper;

import com.example.demo.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface StudentMapper {
//    Student getInfo(@RequestParam("id") int id);
    List<Student> select();
    void insertStudent(@Param("name") String name, @Param("age") Integer age,@Param("email") String email );
    void updateById(@Param("student") Student student, @Param("id")int id);
    int deleteById(@Param("id") int id);
}


