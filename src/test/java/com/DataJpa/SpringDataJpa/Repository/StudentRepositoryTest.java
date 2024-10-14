package com.DataJpa.SpringDataJpa.Repository;

import com.DataJpa.SpringDataJpa.Entity.Guardian;
import com.DataJpa.SpringDataJpa.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
     void saveStudent(){
        Student student = Student.builder()
                .emailId("giridharan@gmail.com")
                .firstName("giri")
                .lastName("dharan")
//                .guardianEmail("gardian@gmail.com")
//                .guardianName("garidan")
//                .guardianPhone("6382083992")
                .build();
        studentRepository.save(student);
    }

    @Test
    void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("jbsdbdbjs")
                .name("hihisdib")
                .phone("6373883")
                .build();
        Student student = Student.builder()
                .lastName("snajay")
                .firstName("hari")
                .emailId("harisanjay@gmail.com")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    void printAllStudent(){
        List<Student> students = studentRepository.findAll();
        System.out.println("Students : "+students);
    }
}