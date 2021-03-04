package com.expresso.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.Coffee;

public interface CoffeeDao {
	public ArrayList<Coffee> getAllRecords() throws SQLException;
	public int getCoffeePriceByName();

}
