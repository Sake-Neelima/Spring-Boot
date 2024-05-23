package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner {
	private String driver; // input for single yml file
	private String url;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
