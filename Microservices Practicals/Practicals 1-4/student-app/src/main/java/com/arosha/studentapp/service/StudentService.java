package com.arosha.studentapp.service;

import com.arosha.studentapp.model.Student;

public interface StudentService {
    Student save(Student student);
    Student getStudentById(int Id);
}
