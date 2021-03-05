package com.expresso.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.CoffeeAddOn;

public interface CoffeeAddOnService {
	public ArrayList<CoffeeAddOn> getAllRecords() throws SQLException;
}
