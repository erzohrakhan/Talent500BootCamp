package com.expresso.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.Coffee;

public interface CoffeeService {
	public ArrayList<Coffee> getAllRecords() throws SQLException;
	public int getCoffeePriceByName();

}
