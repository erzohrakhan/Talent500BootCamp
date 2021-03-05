package com.expresso.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.Coffee;
import com.expresso.dao.CoffeeDao;
import com.expresso.dao.CoffeeDaoImpl;

public class CoffeeServiceImpl implements CoffeeService{
	private CoffeeDao coffeeDao = new CoffeeDaoImpl();

	@Override
	public ArrayList<Coffee> getAllRecords() throws SQLException {
		return coffeeDao.getAllRecords();
	}
}
