package com.expresso.bean;

import java.util.ArrayList;

public class Order {
	ArrayList<Coffee> coffeeList;
	ArrayList<CoffeeAddOn> addOnList;
	DiscountVoucher disVoucher;
	Customer customer;
	
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
	
	public void addCoffee(Coffee coffee) {
		if (coffeeList == null)
			coffeeList = new ArrayList<Coffee>();
		coffeeList.add(coffee);
	}
	
	public void addAddOn(CoffeeAddOn addOn) {
		if (addOnList == null)
			addOnList = new ArrayList<CoffeeAddOn>();
		addOnList.add(addOn);
	}
	
	public DiscountVoucher getDisVoucher() {
		return disVoucher;
	}
	public void setDisVoucher(DiscountVoucher disVoucher) {
		this.disVoucher = disVoucher;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
