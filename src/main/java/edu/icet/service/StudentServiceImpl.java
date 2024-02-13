package edu.icet.service;

import edu.icet.Repository.StudentRepository;
import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService {


     StudentRepository repository;

    ModelMapper mapper;

    @Bean
    public void setup(){
        this.mapper = new ModelMapper();
    }
    @Override
    public void addStudent(StudentDto student) {

        Student student1 = mapper.map(student,Student.class);
//        Student student1 = new Student();
//        student1.setFirstName(student.getFirstName());
//        student1.setLastName(student.getLastName());
//        student1.setContact(student.getContact());

        repository.save(student1);
    }

}
