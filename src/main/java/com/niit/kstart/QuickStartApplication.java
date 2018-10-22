package com.niit.kstart;

import com.niit.kstart.bean.Course;
import com.niit.kstart.bean.Hello;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(QuickStartApplication.class, args);
//		System.out.println("使用Spring Boot开始注入Hello的bean,它由Teacher和Student的bean装配而成");
//		Course course =(Course) ac.getBean("course");
//		System.out.println(course.toString());
	}
}
