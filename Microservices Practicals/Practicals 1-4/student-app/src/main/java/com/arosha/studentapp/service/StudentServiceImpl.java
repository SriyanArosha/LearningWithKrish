package com.arosha.studentapp.service;

import com.arosha.studentapp.model.Student;
import com.arosha.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentById(int Id){
        Optional<Student> student = studentRepository.findById(Id);
        if(student.isPresent()){
            return student.get();
        }else{
            return null;
        }
    }
}
