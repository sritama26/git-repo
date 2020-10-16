package com.lti.model;

public class Product {

	
	int productId;
	String productDesc;

	double price;
	
	public double getPrice() {
		return price;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
