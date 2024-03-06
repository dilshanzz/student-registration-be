package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("student")
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    StudentEntity addStudent(@RequestBody Student student){
        System.out.println(student);
//        try {
//            Thread.sleep(5000);
//            return studentService.addStudent(student);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        return studentService.addStudent(student);
    }

    @GetMapping("search/{id}")
    Student getStudent(@PathVariable Long id){
         return studentService.getStudent(id);
    }

    @GetMapping("/get")
    List<StudentEntity> getAllStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/{id}")
    public String removeStudent(@PathVariable Long id){

       return studentService.removeStudent(id) ? "student removed"
               : "operation failed" ;

    }

//        boolean isRemoved =  studentService.removeStudent(id);
//        if( isRemoved){
//            return ("Student Removed");
//        }
//        return ("operation failed");
//    }
}
