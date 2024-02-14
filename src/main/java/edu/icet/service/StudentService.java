package edu.icet.service;

import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;


public interface StudentService {
    void addStudent(StudentDto student);

    Student searchStudById(Long id);

    boolean deleteStudent(Long id);
}
