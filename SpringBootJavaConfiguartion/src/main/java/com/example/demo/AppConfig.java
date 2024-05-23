package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public JsonJob jobj() {
		JsonJob js=new JsonJob();
		js.setName("Nimbu");
		js.setCode("XPUML");
		return js;
		
	}
}
