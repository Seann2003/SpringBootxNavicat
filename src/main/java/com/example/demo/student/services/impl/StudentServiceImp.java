package com.example.demo.student.services.impl;

import com.example.demo.student.entity.Student;
import com.example.demo.student.mapper.StudentMapper;
import com.example.demo.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired //Write this when you want to call an object
    private StudentMapper studentMapper;

//    @Override
//    public static Student getStudentInfo(int id){
//        return studentMapper.getInfo(id);
//    }

    @GetMapping
    public List<Student> getStudents() {
        return studentMapper.select();
    }


    @Override
    public void insertStudent(Student student){
        studentMapper.insertStudent(student.getName(),student.getAge(),student.getEmail());
    }

    @Override
    public void updateById(Student student, int id){
        studentMapper.updateById(student, id);
    }

    @Override
    public int deleteById(int id){
        return studentMapper.deleteById(id);
    }

}
