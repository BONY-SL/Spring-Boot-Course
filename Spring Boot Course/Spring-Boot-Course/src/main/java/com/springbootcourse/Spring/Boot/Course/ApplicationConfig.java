package com.springbootcourse.Spring.Boot.Course;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


@Configuration
//@Profile("dev")
public class ApplicationConfig {


    @Bean
    //@Profile("dev")
    public MyFirstClass myFirstBean(){
      return new MyFirstClass("  first Bean");
   }

    @Bean
    //@Profile("test")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("  second Bean");
    }

    @Bean
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("  third Bean");
    }
}
