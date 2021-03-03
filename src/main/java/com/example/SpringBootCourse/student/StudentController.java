package com.example.SpringBootCourse.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("api/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/api/students/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping("api/students")
    public void addStudent(@RequestBody Student newStudent) {
        studentService.addStudent(newStudent);
    }

    @PutMapping("api/students/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("api/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
