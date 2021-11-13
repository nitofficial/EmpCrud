package com.example.demo.model;


import javax.xml.bind.annotation.XmlRootElement;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "employee")
public class Employee {
	
	private String name;
	private int id;
	@Transient
	public static final String COUNTER_NAME="empCounter";





	public Employee(String name,int id) {
		System.out.println("INSIDE EMPLOYEE CLASS");
		this.name=name;
		this.id = id;
		
	}
	
	public Employee() {
		System.out.println("GIT TEST")
		System.out.println("INSIDE EMPLOYEE CLASS");
		
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		System.out.println("getName" + name);
		return name;
	}
	

	public void setName(String name) {
		System.out.println("setName" + name);		
		this.name = name;
	}

}
