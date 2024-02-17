package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;

public interface StudentService {
    StudentEntity addStudent(Student student);
}
