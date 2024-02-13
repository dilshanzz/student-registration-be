package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;
import edu.icet.service.StudentService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("student/add")
     void addStudent(@RequestBody StudentDto student){
         service.addStudent(student);
    }

//    public List<Student> getStudent(){
//        return service.getStudents;
//    }
}
