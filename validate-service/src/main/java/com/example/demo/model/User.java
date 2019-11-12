package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document 
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private ObjectId _id;
	private String username;
	private String password;
	public String get_id() {
		return _id.toHexString();
	}
}