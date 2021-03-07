package com.expresso.bean;

import java.sql.Date;

public class Bill {

	private Date date;
	private int totalValue;
	private int discount;
	private int netValue;
	private int totalBill;
	private int gst;
	private int serviceTax;
	private int customer_id;

	public Bill() {
	}

	public Bill(int totalValue, int discount, int netValue, int totalBill, int gst, int serviceTax, int customer_id) {
	
		this.totalValue = totalValue;
		this.discount = discount;
		this.netValue = netValue;
		this.totalBill = totalBill;
		this.gst = gst;
		this.serviceTax = serviceTax;
		this.customer_id = customer_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getNetValue() {
		return netValue;
	}

	public void setNetValue(int netValue) {
		this.netValue = netValue;
	}

	public int getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public int getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(int serviceTax) {
		this.serviceTax = serviceTax;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Bill [date=" + date + ", totalValue=" + totalValue + ", discount=" + discount + ", netValue=" + netValue
				+ ", totalBill=" + totalBill + ", gst=" + gst + ", serviceTax=" + serviceTax + ", customer_id="
				+ customer_id + "]";
	}
	
	
}
