package com.example.demo;

public class DbConn {
	private String Driver;
	private String url;
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "DbConn [Driver=" + Driver + ", url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	public String getDriver() {
		return Driver;
	}
	public void setDriver(String driver) {
		Driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	

}
