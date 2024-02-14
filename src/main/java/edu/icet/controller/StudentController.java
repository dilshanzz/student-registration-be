package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;
import edu.icet.service.StudentService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

   final StudentService service;

    @PostMapping("/add")
     void addStudent(@RequestBody StudentDto student){
         service.addStudent(student);
    }

    @GetMapping({"/id"})
    public Student searchStudentById(@PathVariable Long id){
      return   service.searchStudById(id);
    }

    @DeleteMapping({"/id"})
    public String deleteStudent(@PathVariable Long id){
        return service.deleteStudent(id) ? "Deleted"  :
                "Not found";

    }
    public  List<Student> getAllStudents(){
        return service.getBooks();
    }
}
