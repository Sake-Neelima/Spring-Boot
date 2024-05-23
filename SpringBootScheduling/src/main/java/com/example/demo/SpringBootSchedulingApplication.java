package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SpringBootSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingApplication.class, args);
	}

}
