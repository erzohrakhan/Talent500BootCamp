package com.expresso.client;

import java.sql.SQLException;

import com.expresso.presentation.CoffeePrest;
import com.expresso.presentation.CoffeePrestImpl;
import com.expresso.service.CoffeeService;
import com.expresso.service.CoffeeServiceImpl;

public class ExpressoMain {
	public static void main(String[] args) {
		CoffeePrest coffeePres = new CoffeePrestImpl();
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to Expresso Caffe");
		coffeePres.showMenu();
		CoffeeService cf = new CoffeeServiceImpl();
		try {
			cf.getAllRecords();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
