package com.springbootcourse.Spring.Boot.Course.service;

import com.springbootcourse.Spring.Boot.Course.dto.StudentDTO;
import com.springbootcourse.Spring.Boot.Course.dto.StudentResponseDto;
import com.springbootcourse.Spring.Boot.Course.mappers.StudentMapper;
import com.springbootcourse.Spring.Boot.Course.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    public StudentResponseDto saveStudent(StudentDTO dto) {

        var savedStudent = studentRepository.save(studentMapper.convertStudentDtoToStudent(dto));

        return studentMapper.convertStudentToStudentResponseDto(savedStudent);
    }

    public StudentResponseDto getStudentByID(Integer studentId) {

        return studentRepository.findById(studentId)
                .map(studentMapper::convertStudentToStudentResponseDto)
                .orElse(null);
    }

    public List<StudentResponseDto> getStudents() {

        return studentRepository.findAll()
                .stream()
                .map(studentMapper::convertStudentToStudentResponseDto).collect(Collectors.toList());
    }

    public List<StudentResponseDto> findAllByFirstName(String firstname) {
        return studentRepository.findAllByFirstnameContaining(firstname)
                .stream()
                .map(studentMapper::convertStudentToStudentResponseDto)
                .collect(Collectors.toList());

    }

    public void deleteStudent(Integer id) {

        studentRepository.deleteById(id);
    }
}
