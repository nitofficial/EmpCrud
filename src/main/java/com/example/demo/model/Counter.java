package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

<<<<<<< HEAD
//hello counter 1
=======
// hello counter
>>>>>>> dc94ea8eeab5301951819e90178f99c808460141

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
