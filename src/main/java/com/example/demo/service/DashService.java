package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.example.demo.model.FileCount;
import com.example.demo.model.FileModel;

@Service
public class DashService {
	
	private MongoTemplate mongoTemplate;
	
	@Autowired
	public DashService(MongoTemplate mongoTemplate) {
		//adsd
		this.mongoTemplate = mongoTemplate;
	}
	
	
	public long countFiles() {
		Query query = new Query();
		return mongoTemplate.count(query, FileModel.class);
		
	}

	public String addEntry(FileCount entry) {
		mongoTemplate.save(entry);
		return entry.getTime()+" "+ entry.getFiles_count()+" added";		
		
		
		
	}
}

	
