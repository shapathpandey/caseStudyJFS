package com.cg.catelogService.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection="userCart")
public class UserCart {	
	@Id
	private String emailId;
	private String email;
	ArrayList<String> ar = new ArrayList<String>();
	public UserCart() {
		super();
	}
	public UserCart(String emailId, String email, ArrayList<String> ar) {
		super();
		this.emailId = emailId;
		this.email = email;
		this.ar = ar;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getAr() {
		return ar;
	}
	public void setAr(ArrayList<String> ar) {
		this.ar = ar;
	}
	
}
