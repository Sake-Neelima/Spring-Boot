package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnotations {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootAnnotation.class, args);
		Employee es=ac.getBean("employee",Employee.class);
		System.out.println(es);
	}

}
