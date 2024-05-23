package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class MydataRunner implements CommandLineRunner {
	private String driver; //input for multiple yml files 
		private String pwd;
		

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this);

	}

}
