package com.expresso.bean;

public class Customer {
	private int id;
	private String name;
	private String phoneNo;

	public Customer() {
	}

	public Customer(String name, String phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public Customer(String phoneNo) {
		this.name = "Anonymous";
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNo=" + phoneNo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
