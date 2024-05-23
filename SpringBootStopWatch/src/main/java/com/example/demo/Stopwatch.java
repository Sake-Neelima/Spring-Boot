package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.Data;
@Component
@Data
public class Stopwatch implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		StopWatch watch=new StopWatch();
	   
		/*watch.start();
		for(int i=1;i<10000;i++) {
			double result=Math.pow(i+1, i)+Math.pow(3, i);
		}
		 watch.stop();
		
		 watch.start();
			for(int i=1;i<10000;i++) {
				Double result=Math.pow(i+1, i)+Math.pow(3, i);
			}
			 watch.stop();
		 
			 watch.start();
				for(int i=1;i<10000;i++) {
					Double result=Math.pow(i+1, i)+Math.pow(3, i);
				}
				 watch.stop();
		 
		 System.out.println(watch.getTotalTimeSeconds());
		 System.out.println(watch.getTotalTimeMillis());*/
		
		
		 
		 watch.start("#Loop1");
			for(int i=1;i<10000;i++) {
				double result=Math.pow(i+1, i)+Math.pow(3, i);
			}
			 watch.stop();
			
			 watch.start("#Loop2");
				for(int i=1;i<10000;i++) {
					Double result=Math.pow(i+1, i)+Math.pow(3, i);
				}
				 watch.stop();
			 
				 watch.start("#Loop3");
					for(int i=1;i<10000;i++) {
						Double result=Math.pow(i+1, i)+Math.pow(3, i);
					}
					 watch.stop();
			 
			 System.out.println(watch.prettyPrint());
			 
			 
		 
		 
	}
	

}
