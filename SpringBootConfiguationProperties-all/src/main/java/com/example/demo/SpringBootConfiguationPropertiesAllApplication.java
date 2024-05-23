package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","naresh.it.com","rgukt.com"
	
	
})
public class SpringBootConfiguationPropertiesAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfiguationPropertiesAllApplication.class, args);
	}

}
