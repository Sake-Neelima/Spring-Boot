package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Testprofile implements CommandLineRunner {
	//@Qualifier("emailAlertSystem")
	//@Qualifier("smsAlertSystem")
	
	@Autowired
	private AlertSystem als;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		als.sendMessage();
	}

}
