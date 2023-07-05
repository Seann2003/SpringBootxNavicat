package com.example.demo.student.services;

import com.example.demo.student.entity.Student;


import java.util.List;

public interface StudentService {
    List<Student> getStudents();

//    static Student getStudentInfo(int id);

    void insertStudent(Student student);

    void updateById(Student student, int id);

    int deleteById(int id);

}
