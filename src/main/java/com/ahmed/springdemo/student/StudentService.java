package com.ahmed.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(new Student("Ahmed", "Mohamed", LocalDate.now(),"abmahmed99@gmail.com",24),
                new Student("midou1", "Mohamed", LocalDate.now(),"ahm@gmail.com",22)
        );
    }
}
