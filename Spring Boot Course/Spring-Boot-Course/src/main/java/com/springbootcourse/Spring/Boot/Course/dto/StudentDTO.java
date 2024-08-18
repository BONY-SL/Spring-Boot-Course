package com.springbootcourse.Spring.Boot.Course.dto;

import jakarta.validation.constraints.NotEmpty;

public record StudentDTO(

        @NotEmpty(message = "First Name Should not Empty")
        String firstname,

        @NotEmpty(message = "Last Name Should not Empty")
        String lastname,

        @NotEmpty(message = "Email Should not Empty")
        String email,
        Integer schoolId
) {
}
