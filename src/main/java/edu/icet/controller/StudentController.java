package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("student")
@CrossOrigin

public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    StudentEntity addStudent(@RequestBody Student student){
        System.out.println(student);
        return studentService.addStudent(student);
    }
}
