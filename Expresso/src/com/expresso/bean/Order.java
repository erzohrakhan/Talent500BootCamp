package com.expresso.bean;

import java.util.ArrayList;

public class Order {
	ArrayList<Coffee> coffeeList;
	ArrayList<CoffeeAddOn> addOnList;
	
	public ArrayList<Coffee> getCoffeeList() {
		return coffeeList;
	}
	public void setCoffeeList(ArrayList<Coffee> coffeeList) {
		this.coffeeList = coffeeList;
	}
	public ArrayList<CoffeeAddOn> getAddOnList() {
		return addOnList;
	}
	public void setAddOnList(ArrayList<CoffeeAddOn> addOnList) {
		this.addOnList = addOnList;
	}
	

}
