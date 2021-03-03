package com.example.SpringBootCourse.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1L, "Luke", "Skywalker", LocalDate.of(1999, Month.JANUARY, 1)),
                new Student(2L, "Obiwan", "Kenobi", LocalDate.of(1990, Month.DECEMBER, 15)),
                new Student(3L, "Han", "Solo", LocalDate.of(1995, Month.JUNE, 30))
        );
    }
}
