package com.expresso.bean;

public class DiscountVoucher {
	private int id;
	private String discountVoucher;
	private int discountRate;

	public String getDiscountVoucher() {
		return discountVoucher;
	}

	public void setDiscountVoucher(String discountVoucher) {
		this.discountVoucher = discountVoucher;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
