package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJavaConfiguartionApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootJavaConfiguartionApplication.class, args);
		JsonJob jb=ac.getBean("jobj",JsonJob.class);
		System.out.println(jb);
	
	
	}

}
