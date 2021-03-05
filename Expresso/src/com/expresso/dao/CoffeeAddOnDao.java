package com.expresso.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.CoffeeAddOn;

public interface CoffeeAddOnDao {
	public ArrayList<CoffeeAddOn> getAllRecords() throws SQLException;
	public int getCoffeeAddOnPriceById();

}
