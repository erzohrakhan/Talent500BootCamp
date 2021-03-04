package com.expresso.dao;

import java.util.ArrayList;

import com.expresso.bean.CoffeeAddOn;

public interface CoffeeAddonDao {
	public ArrayList<CoffeeAddOn> getAllRecords();
	public int getCoffeeAddOnPriceByName();

}
