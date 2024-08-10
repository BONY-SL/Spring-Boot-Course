package com.springbootcourse.Spring.Boot.Course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class SpringBootCourseApplication {

	public static void main(String[] args) {


		var app = new SpringApplication(SpringBootCourseApplication.class);

		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));

		var context= app.run(args);

//		var app = new SpringApplication(SpringBootCourseApplication.class);
//
//		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
//
//		var context= app.run(args);

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());

	}
}
