package com.example.SpringBootCourse.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1L, "Luke", "Skywalker", LocalDate.of(1999, Month.JANUARY, 1)),
            new Student(2L, "Obiwan", "Kenobi", LocalDate.of(1990, Month.DECEMBER, 15)),
            new Student(3L, "Han", "Solo", LocalDate.of(1995, Month.JUNE, 30))
    ));


    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().get();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Long id, Student updatedStudent) {
        for(int i=0; i<students.size(); i++) {
            Student st = students.get(i);
            if(st.getId().equals(id)) {
                students.set(i, updatedStudent);
                return;
            }
        }
    }
}
