package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;


    //With out Using Qulifier Error
    public MyFirstService(@Qualifier("b2") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return "The Dependency is saying : "+ myFirstClass.Hello();
    }
}
