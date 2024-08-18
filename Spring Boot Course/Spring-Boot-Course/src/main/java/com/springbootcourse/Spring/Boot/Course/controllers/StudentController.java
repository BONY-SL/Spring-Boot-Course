package com.springbootcourse.Spring.Boot.Course.controllers;
import com.springbootcourse.Spring.Boot.Course.dto.StudentDTO;
import com.springbootcourse.Spring.Boot.Course.dto.StudentResponseDto;
import com.springbootcourse.Spring.Boot.Course.models.Student;
import com.springbootcourse.Spring.Boot.Course.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {


    private final StudentService studentService;

    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello World....";
    }

    @PostMapping("/post")
    public String post(@RequestParam (value = "message") String message){

        return "Request accepted..." +message;
    }

    @PostMapping("/saveStudent")
    public StudentResponseDto saveStudent(@RequestBody StudentDTO dto){

        return studentService.saveStudent(dto);
    }

    @GetMapping("/getStudentByID/{studentId}")
    public StudentResponseDto getStudentByID(@PathVariable Integer studentId){

        return studentService.getStudentByID(studentId);
    }

    @GetMapping("/getStudents")
    public List<StudentResponseDto> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/findAllByFirstName/{firstname}")
    public List<StudentResponseDto> findAllByFirstName(@PathVariable String firstname){
        return studentService.findAllByFirstName(firstname);
    }


    @DeleteMapping("/deleteStudent/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer id){

         studentService.deleteStudent(id);
    }
}
