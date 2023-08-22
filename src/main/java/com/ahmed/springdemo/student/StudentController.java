package com.ahmed.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
@GetMapping
    public List<String> findAllStudents() {
        return List.of("Ahmed", "Mohamed", "Ali");
    }
}
