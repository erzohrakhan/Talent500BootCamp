package com.expresso.bean;

public class Customer {
	private String name;
	private String phoneNo;
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
	
}
