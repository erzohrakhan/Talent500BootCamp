package com.expresso.bean;

public class Coffee {
	private int id;
	private String name;
	private int price_small;
	private int price_med;
	private int price_large;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice_small() {
		return price_small;
	}

	public void setPrice_small(int price_small) {
		this.price_small = price_small;
	}

	public int getPrice_med() {
		return price_med;
	}

	public void setPrice_med(int price_med) {
		this.price_med = price_med;
	}

	public int getPrice_large() {
		return price_large;
	}

	public void setPrice_large(int price_large) {
		this.price_large = price_large;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Coffee [id=" + id + ", name=" + name + ", price_small=" + price_small + ", price_med=" + price_med
				+ ", price_large=" + price_large + "]";
	}

}
