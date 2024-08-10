package com.springbootcourse.Spring.Boot.Course;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class MyFirstClass {


    private final String myVar;

    @Value("${my.custom.property}")
    private String dev;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String Hello(){
        return "Hello from my FirstClass >>>"+myVar +" "+dev;
    }
}
