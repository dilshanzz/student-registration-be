package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity addStudent(Student student);

    List<StudentEntity> getStudents();

    Student getStudent(Long id);

    boolean removeStudent(Long id);
}
