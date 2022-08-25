package com.webapp.hibernate_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "person_table") //if we doesn't specify, table_name will be class name ie.person, if we change this it will create a new entity
public class Person {

	@Id
	private int id;
	
	//@Column(name="person_name")
	private PersonName name;
	
	private String city;
	//@Transient - it will be temp data not stored in db
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public PersonName getName() {
		return name;
	}
	public void setName(PersonName name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
