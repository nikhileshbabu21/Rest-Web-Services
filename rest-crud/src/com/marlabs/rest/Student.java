/**
 * 
 */
package com.marlabs.rest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Nikhilesh
 *
 */
public class Student {
	
	String Email;
	String Name;
    String Password;
	public Student(String email, String name, String password) {
		super();
		Email = email;
		Name = name;
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Student [Email=" + Email + ", Name=" + Name + ", Password=" + Password + "]";
	}
}
    