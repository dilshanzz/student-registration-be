package edu.icet.service;

import edu.icet.Repository.StudentRepository;
import edu.icet.dto.StudentDto;
import edu.icet.entity.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class StudentServiceImpl implements StudentService {


    final StudentRepository repository;

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

    @Override
    public Student searchStudById(Long id) {
        Optional<Student> student =repository.findById(id);

        return
               mapper.map(student,Student.class);
    }

    @Override
    public boolean deleteStudent(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return  true;
        }
        return false;
    }

    @Override
    public List<Student> getBooks() {


        return (List<Student>) repository.findAll();
    }

}
