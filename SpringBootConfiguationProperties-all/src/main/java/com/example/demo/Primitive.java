package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="my.app")
public class Primitive implements CommandLineRunner{
	private String name;
	private Integer code;
	private Double version;
	public void run(String... args) throws Exception {
		System.out.println(this);

	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Primitive [Name=" + name + ", code=" + code + ", version=" + version + "]";
	}
	
	
	
	
	
}
