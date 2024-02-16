package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

   // StudentService service;
    @PostMapping("/add")
    void addStudent(@RequestBody Student student){
        System.out.println(student);
       // service.addStudent(student);
    }
}
