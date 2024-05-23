package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="app")
public class DataReader implements CommandLineRunner {
	private String db;
	private String pwd;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);

	}

}
