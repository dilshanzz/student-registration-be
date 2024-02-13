package edu.icet.service;

import edu.icet.Repository.StudentRepository;
import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public void addStudent(StudentDto student) {
        Student student1 = new Student();
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setContact(student.getContact());

        repository.save(student1);
    }

}
