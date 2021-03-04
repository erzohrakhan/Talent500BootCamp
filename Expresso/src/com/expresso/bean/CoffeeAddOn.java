package com.expresso.bean;

public class CoffeeAddOn {
	private int id;
	private String addOnType;
	private int price;
	public String getAddOnType() {
		return addOnType;
	}
	public void setAddOnType(String addOnType) {
		this.addOnType = addOnType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CoffeeAddOn [addOnType=" + addOnType + ", price=" + price + "]";
	}
	
}
