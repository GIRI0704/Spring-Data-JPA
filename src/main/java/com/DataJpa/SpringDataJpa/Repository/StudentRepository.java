package com.DataJpa.SpringDataJpa.Repository;

import com.DataJpa.SpringDataJpa.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
