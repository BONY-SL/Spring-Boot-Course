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

    @PostMapping("/post-order-record")
    public String postOrderRecord(@RequestBody OrderRecord order){

        return "Request accepted..." + order.toString();
    }

    //http://localhost:8080/hellodilshan/dilshan
    @GetMapping("/hellodilshan")
    public String requestParam(@RequestParam("name") String  name){

        return "Request accepted... RequestParam " + name;
    }

    //http://localhost:8080/hellodilshan?name=dilshan
    @GetMapping("/hellodilshan2/{name}")
    public String pathVariable(@PathVariable("name") String  name){

        return "Request accepted...PathVariable " + name;
    }
}
