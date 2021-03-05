package com.expresso.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.CoffeeAddOn;
import com.expresso.dao.CoffeAddOnDaoImpl;
import com.expresso.dao.CoffeeAddOnDao;

public class CoffeAddOnServiceImpl implements CoffeeAddOnService {
	CoffeeAddOnDao addOnDao = new CoffeAddOnDaoImpl();
	public ArrayList<CoffeeAddOn> getAllRecords() throws SQLException{
		return addOnDao.getAllRecords();
		
	}

}
