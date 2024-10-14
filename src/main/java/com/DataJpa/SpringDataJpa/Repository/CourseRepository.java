package com.DataJpa.SpringDataJpa.Repository;

import com.DataJpa.SpringDataJpa.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
