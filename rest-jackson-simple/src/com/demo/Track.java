package com.demo;

public class Track {

	private String Name;
	private String Email;
	private String Password;
	
	
	public Track() {
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Track [Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
	}

	
}