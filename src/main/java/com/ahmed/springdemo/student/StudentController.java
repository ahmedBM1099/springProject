package com.ahmed.springdemo.student;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
public Student save(@RequestBody Student s) {
        return service.save(s);
    }
    @GetMapping(path = "{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }
    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
    @PutMapping
public Student update(@RequestBody Student s){
        return service.update(s);
}
@DeleteMapping(path = "{email}")
public void delete(@PathVariable("email") String email) {
    service.delete(email);
}
}
