package com.expresso.bean;

import java.util.ArrayList;

public class OrderList {
	ArrayList<Order> orderList;
	DiscountVoucher disVoucher;
	Customer customer;

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> order) {
		this.orderList = order;
	}

	public void addOrderList(Order order) {
		if (order == null)
			orderList = new ArrayList<Order>();
		orderList.add(order);
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

	public void addOrder(Order order) {
		if (orderList == null)
			orderList = new ArrayList<Order>();
		orderList.add(order);
	}
}