package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {


    private final StudentRepository studentRepository;

    @Autowired
    public FirstController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello World....";
    }

    @PostMapping("/post")
    public String post(@RequestParam (value = "message") String message){

        return "Request accepted..." +message;
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){

        return studentRepository.save(student);
    }

    @GetMapping("/getStudentByID/{studentId}")
    public Student getStudentByID(@PathVariable Integer studentId){

        return studentRepository.findById(studentId).orElse(new Student());
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/findAllByFirstName/{firstname}")
    public List<Student> findAllByFirstName(@PathVariable String firstname){
        return studentRepository.findAllByFirstnameContaining(firstname);
    }


    @DeleteMapping("/deleteStudent/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable Integer id){

         studentRepository.deleteById(id);
    }
}
