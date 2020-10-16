package com.lti.model;

public class Product {

	
	int productId;
	String productDesc;
	int quantity;
	
	public int getQuantity(){
		return quantity;
	}
	
	public int getProductId() {
		return productId;
	}
	public  void setQuantity(int quantity){
		this.quantity=quantity;
		
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
}
