package com.springbootcourse.Spring.Boot.Course;

public record StudentDTO(

        String firstname,
        String lastname,
        String email,
        Integer schoolId
) {
}
