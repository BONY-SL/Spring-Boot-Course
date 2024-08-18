package com.springbootcourse.Spring.Boot.Course.dto;

public record StudentDTO(

        String firstname,
        String lastname,
        String email,
        Integer schoolId
) {
}
