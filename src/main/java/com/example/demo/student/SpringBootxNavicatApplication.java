package com.example.demo.student;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.student.mapper")
public class SpringBootxNavicatApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootxNavicatApplication.class, args);
    }

//    @GetMapping
//    public List<Student> hello() {
//        return null;
//    }
}
