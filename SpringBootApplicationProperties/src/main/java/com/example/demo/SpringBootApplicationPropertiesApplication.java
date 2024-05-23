package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({
	"file:./mno.properties",
	"classpath:abc.properties"})
public class SpringBootApplicationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationPropertiesApplication.class, args);
	}

}
