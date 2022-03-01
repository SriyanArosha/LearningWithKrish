package com.arosha.studentapp.controller;

import com.arosha.studentapp.model.Student;
import com.arosha.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/greet", method= RequestMethod.GET)
    public String PrintGreeting(){
        return "Hello Springboot";
    }

    @RequestMapping(value="/greet", method= RequestMethod.POST)
    public String PrintGreeting2(){
        return "Hello Springboot from POST";
    }

    @RequestMapping(value="/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value="/student", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@RequestParam int Id){
        Student student = studentService.getStudentById(Id);
        if(student == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(student);
        }
    }
}
