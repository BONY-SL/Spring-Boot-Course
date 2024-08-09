package com.springbootcourse.Spring.Boot.Course;


import org.springframework.stereotype.Service;

public class MyFirstClass {


    private final String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String Hello(){
        return "Hello from my FirstClass >>>"+myVar;
    }
}
