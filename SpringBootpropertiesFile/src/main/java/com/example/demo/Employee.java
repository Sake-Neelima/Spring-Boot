package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Employee implements CommandLineRunner {

	@Value("${app-id}")
	private Integer Id;
	@Value("${title}")
	private String Title;
	@Value("${version}")
	private String Version;
	public void run(String... args) throws Exception {
		System.out.println(this);
		

	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Title=" + Title + ", Version=" + Version + "]";
	}

}
