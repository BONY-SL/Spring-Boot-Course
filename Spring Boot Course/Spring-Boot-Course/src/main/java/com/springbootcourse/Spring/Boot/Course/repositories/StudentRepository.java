package com.springbootcourse.Spring.Boot.Course.repositories;

import com.springbootcourse.Spring.Boot.Course.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllByFirstnameContaining(String firstname);
}
