package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ApplicationConfig {


    @Bean
    public MyFirstClass myFirstClass(){
      return new MyFirstClass("  first Bean");
   }

    @Bean
    public MyFirstClass mySecondClass(){
        return new MyFirstClass("  second Bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdClass(){
        return new MyFirstClass("  third Bean");
    }
}
