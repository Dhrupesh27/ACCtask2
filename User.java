package com.journaldev.spring.model;

import java.io.Serializable;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

public class User implements Serializable{

	
	private String name;
        private String contact;
        private String gender;
	public String address;
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String g) {
		this.gender = g;
	}
public String getContact() {
		return contact;
	}
	public void setContact(String c) {
		this.contact = c;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String ac) {
		address = ac;
	}
	
	
	
	
	
}
