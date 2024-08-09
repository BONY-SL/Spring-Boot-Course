package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


    private  MyFirstClass myFirstClass;


    @Autowired
    public void setMyFirstClass(@Qualifier("mySecondBean") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


//    @Autowired
//    public void injectDependencies(@Qualifier("mySecondBean") MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass;
//    }


    public String tellAStory(){
        return "The Dependency is saying : "+ myFirstClass.Hello();
    }


}
