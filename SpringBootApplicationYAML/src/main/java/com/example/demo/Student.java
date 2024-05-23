package com.example.demo;

import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class Student implements CommandLineRunner {
	private Integer id;
	private String name;
	private Double salary;
	
	//private List<String> details;
	//private Set<String> details;
	private String[] details;
	//private Map<String,Integer> Version;
	private Properties Version;
	private Mydata md;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
