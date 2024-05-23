package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
		{"Demo.app.Runner",
		"rgukt.com",
		"com.nit.naresh"
		})
public class SpringBootBasepackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasepackageApplication.class, args);
	}

}
