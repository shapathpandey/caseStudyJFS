package com.cg.loginService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="UserDetails")
public class User {
	@Id
	private String email;
	private String fname;
	private String lname;
	private String passwd;
	private String dob;
	private String gender;
	
	
	public User() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public User(String email, String fname, String lname, String passwd, String dob, String gender) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.passwd = passwd;
		this.dob = dob;
		this.gender = gender;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}


}
