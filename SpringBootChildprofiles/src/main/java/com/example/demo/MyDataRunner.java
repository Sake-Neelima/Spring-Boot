package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="myapp")
public class MyDataRunner implements CommandLineRunner {
	private String driver;
	private String pwd;
	private String port;
	private String name;
	private String user;
	private String url;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);
	}

}
