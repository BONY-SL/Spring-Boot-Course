package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ApplicationConfig {


    @Bean
    @Qualifier("b1")
    public MyFirstClass myFirstBean(){
      return new MyFirstClass("  first Bean");
   }

    @Bean
    @Qualifier("b2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("  second Bean");
    }

    @Bean
    @Qualifier("b3")
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("  third Bean");
    }
}
