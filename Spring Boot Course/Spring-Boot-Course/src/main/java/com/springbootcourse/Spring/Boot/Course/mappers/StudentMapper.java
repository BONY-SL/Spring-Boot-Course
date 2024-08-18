package com.springbootcourse.Spring.Boot.Course.mappers;

import com.springbootcourse.Spring.Boot.Course.dto.StudentDTO;
import com.springbootcourse.Spring.Boot.Course.dto.StudentResponseDto;
import com.springbootcourse.Spring.Boot.Course.models.School;
import com.springbootcourse.Spring.Boot.Course.models.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public StudentResponseDto convertStudentToStudentResponseDto(Student student){

        return new StudentResponseDto(
                student.getFirstname(),
                student.getLastname(),
                student.getEmail()
        );
    }

    public Student convertStudentDtoToStudent(StudentDTO studentDTO){

        var student = new Student();

        student.setFirstname(studentDTO.firstname());
        student.setLastname(studentDTO.lastname());
        student.setEmail(studentDTO.email());

        var school = new School();
        school.setId(studentDTO.schoolId());
        student.setSchool(school);

        return student;

    }
}
