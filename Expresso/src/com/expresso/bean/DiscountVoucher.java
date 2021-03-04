package com.expresso.bean;

import java.util.Date;

public class DiscountVoucher {
	private String discountVoucher;
	private Date expiryDate;
	private int minPrice;
	private int discountRate;
	private int maxDiscount;
	
	
	public String getDiscountVoucher() {
		return discountVoucher;
	}
	public void setDiscountVoucher(String discountVoucher) {
		this.discountVoucher = discountVoucher;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int getMaxDiscount() {
		return maxDiscount;
	}
	public void setMaxDiscount(int maxDiscount) {
		this.maxDiscount = maxDiscount;
	}
}
