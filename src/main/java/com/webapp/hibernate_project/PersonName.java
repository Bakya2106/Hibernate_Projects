package com.webapp.hibernate_project;

import javax.persistence.Embeddable;

@Embeddable //->this class will be embedded to person table
public class PersonName {

	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
