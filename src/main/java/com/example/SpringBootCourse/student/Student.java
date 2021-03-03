package com.example.SpringBootCourse.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    private Long id;
    private String name;
    private String surname;
    private LocalDate dayOfBirth;

    public Student() {
    }

    public Student(Long id, String name, String surname, LocalDate dayOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}
