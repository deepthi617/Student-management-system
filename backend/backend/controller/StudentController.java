package com.sms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public String getAllStudents() {
        return "List of Students";
    }

    @PostMapping
    public String addStudent() {
        return "Student Added";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable Long id) {
        return "Student Updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return "Student Deleted";
    }
}
