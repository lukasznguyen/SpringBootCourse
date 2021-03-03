package com.example.SpringBootCourse.student;

import org.aspectj.weaver.ArrayReferenceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Long id, Student updatedStudent) {
        studentRepository.save(updatedStudent);
    }

    public void deleteStudent(Long id) {
        studentRepository.delete(studentRepository.findById(id).get());
    }
}
