package com.springbootcourse.Spring.Boot.Course;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String helloWorld(){

        return "Hello World....";
    }


    @PostMapping("/post")
    public String post(@RequestParam (value = "message") String message){

        return "Request accepted..." +message;
    }

    @PostMapping("/post-order")
    public String postOrder(@RequestBody Order order){

        return "Request accepted..." + order.toString();
    }
}
