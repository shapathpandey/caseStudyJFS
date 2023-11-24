package com.cg.cartService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Document(collection="Product")
public class Product {
	@Id
	private String id;
	
	private String productName;
	private String companyName;
	
	public Product() {
		
	}
	public Product(String id, String productName, String companyName) {
		super();
		this.id = id;
		this.productName = productName;
		this.companyName = companyName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	@Override
	public String toString() {
		return "Product [id=" +id+ ", productName=" +productName+ ", companyName="
				+companyName+ "]";
	}
	
}
