package com.expresso.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.expresso.bean.Coffee;
import com.expresso.service.CoffeeService;
import com.expresso.service.CoffeeServiceImpl;
import com.expresso.util.ScannerUtil;
import com.expresso.util.SystemUtil;

public class CoffeePrestImpl implements CoffeePrest {
	private CoffeeService coffeeService = new CoffeeServiceImpl();

	public void showMenu() {
		String spaces = "   ";
		Scanner in = ScannerUtil.getScanner();
		System.out.println("Number\tCoffee" + "     " + "Small" + " " + "Medium" + "  " + "Large");
		try {
//			coffeeService.getAllRecords()
//			.forEach(cf-> System.out.println(cf.getId() +"\t\t" +cf.getName()+"\t\t"+cf.getPrice()));
			List<Coffee> cfList = coffeeService.getAllRecords();
			for (Coffee cf : cfList) {
				System.out.format(cf.getId() + "\t" + cf.getName() + spaces + cf.getPrice() + spaces
						+ (cf.getPrice() + ADD_COFFEE_PRICE_MEDIUM) + spaces
						+ (cf.getPrice() + ADD_COFFEE_PRICE_LARGE));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Try Again!");
			new SystemUtil().exit();
		}
		System.out.println("Choose option(1-4): ");
		String option = in.next();
		System.out.println("Select Size (S-small, M- medium, L- large)");
		String size = in.next(); 
		
		

	}

	@Override
	public void onOptionsItemSelected(int option) {

	}

}
