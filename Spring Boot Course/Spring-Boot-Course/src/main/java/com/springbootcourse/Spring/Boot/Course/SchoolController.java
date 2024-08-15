package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/saveSchool")
    public School saveSchool(@RequestBody School school){
        return schoolRepository.save(school);
    }

    @GetMapping("/getAllSchools")
    public List<School> getAllSchools(){
        return schoolRepository.findAll();
    }
}
