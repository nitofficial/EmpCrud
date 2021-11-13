package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//hello counter

@Document(collection="counter")
public class Counter {
	@Id
	private String name;
	private int count;
	
	public Counter() {
		
		System.out.println("INSIDE COUNTER");
	}
	public String getId() {
		return name;
	}
	public void setId(String id) {
		this.name = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	

}
