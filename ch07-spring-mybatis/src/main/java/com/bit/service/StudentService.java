package com.bit.service;

import com.bit.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    List<Student> queryStudents();

}
