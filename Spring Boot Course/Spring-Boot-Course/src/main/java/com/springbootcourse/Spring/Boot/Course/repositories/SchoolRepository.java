package com.springbootcourse.Spring.Boot.Course.repositories;

import com.springbootcourse.Spring.Boot.Course.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
