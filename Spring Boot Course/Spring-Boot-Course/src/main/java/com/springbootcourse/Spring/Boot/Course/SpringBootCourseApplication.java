package com.springbootcourse.Spring.Boot.Course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCourseApplication {

	public static void main(String[] args) {

		var context= SpringApplication.run(SpringBootCourseApplication.class, args);

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());

	}
}
