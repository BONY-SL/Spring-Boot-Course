package com.springbootcourse.Spring.Boot.Course.controllers;

import com.springbootcourse.Spring.Boot.Course.dto.SchoolDto;
import com.springbootcourse.Spring.Boot.Course.repositories.SchoolRepository;
import com.springbootcourse.Spring.Boot.Course.models.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/saveSchool")
    public SchoolDto saveSchool(@RequestBody SchoolDto schoolDto){

        var savedSchool = schoolRepository.save(convertSchoolDtoToSchool(schoolDto));

        return convertSchoolToSchoolDto(savedSchool);
    }

    private SchoolDto convertSchoolToSchoolDto(School school){

        return new SchoolDto(school.getName());
    }

    private School convertSchoolDtoToSchool(SchoolDto schoolDto){

        var school = new School();
        school.setName(schoolDto.name());

        return school;
    }

    @GetMapping("/getAllSchools")
    public List<SchoolDto> getAllSchools(){
        return schoolRepository.findAll()
                .stream()
                .map(this::convertSchoolToSchoolDto)
                .collect(Collectors.toList());
    }

}
