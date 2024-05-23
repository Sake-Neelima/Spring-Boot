package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Profile("default")
public class SmsAlertSystem implements AlertSystem {
		@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("FROM SMS ALERT SYSTEM");
	}

}
