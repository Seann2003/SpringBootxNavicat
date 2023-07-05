package com.example.demo.student.controller;

import com.example.demo.student.entity.Student;
import com.example.demo.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//api layer

//For SpringBoot, we use RESTful web services, using annotations like @RestController, @RequestMapping, @GetMapping and @PostMapping
@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @RequestMapping("getInfo/{id}")
//    public Student getInfo(@PathVariable int id){
//        return StudentService.getStudentInfo(id);
//    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/showUser")
    public String insertNewUser(){
        Student student = new Student();
        student.setName("Good");
        student.setAge(4);
        student.setEmail("lebron@gmail.com");
        studentService.insertStudent(student);
        return null;
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        int result = studentService.deleteById(id);
        if (result >= 1){
            return "Removed";
        }else{
            return "Not Removed";
        }
    }

    @GetMapping("/changeUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        Student student = new Student();
        student.setName("Change");
        student.setAge(2);
        student.setEmail("new@example.com");
        studentService.updateById(student, id);
        if (id >= 1){
            return "Updated";
        }else{
            return "Not updated";
        }
    }

// For normal case, create uses HTTP POST
//    Read uses HTTP GET
//    Update uses HTTP PUT or PATCH
//    Delete uses HTTP Delete


}
