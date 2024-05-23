package com.example.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class MyData {
	/*(fixedDelay=5000)
	public void Data() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello"+ new Date());
		}
	}*/ 
	
	/*@Scheduled(fixedRate=800)
	public void Data() {
	 
			System.out.println("Hello"+ new Date());
		
	}*/
	
	//@Scheduled(cron="* * * * * *")
	/*@Scheduled(cron="0 0 9 * * *")
	@Scheduled(cron="* * 18 * * *")
	@Scheduled(cron="* * 8,18 * * *")
	@Scheduled(cron="* 30 8 * * *")
	@Scheduled(cron="* 10 * * * *")
	@Scheduled(cron="10 * * * * *")
	@Scheduled(cron="* * 9 1 * *")
	@Scheduled(cron="* * 8-11 * * *")
	@Scheduled(cron="* * 9 1 1 sun")
	@Scheduled(cron="* * * ? 8 ?")
	@Scheduled(cron="59 59 23 31 12 *")*/
	@Scheduled(cron="0/10 * * * * *")
	//@Scheduled(cron="* 0/10 9  * *")
	
	
	
	
	
	
	public void Data() {
	 
			System.out.println("Hello"+ new Date());
		
	}
	
}
