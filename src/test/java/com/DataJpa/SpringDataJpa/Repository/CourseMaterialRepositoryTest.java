package com.DataJpa.SpringDataJpa.Repository;

import com.DataJpa.SpringDataJpa.Entity.Course;
import com.DataJpa.SpringDataJpa.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    CourseMaterialRepository courseMaterialRepository;

    @Test
    void saveCourseMaterial(){
        Course course = Course.builder()
                .title("computer science")
                .credit(5)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }
}