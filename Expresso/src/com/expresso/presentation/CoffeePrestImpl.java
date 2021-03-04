package com.expresso.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.expresso.bean.Coffee;
import com.expresso.bean.Order;
import com.expresso.service.CoffeeService;
import com.expresso.service.CoffeeServiceImpl;
import com.expresso.util.ScannerUtil;
import com.expresso.util.SystemUtil;

public class CoffeePrestImpl implements CoffeePrest {
	private CoffeeService coffeeService = new CoffeeServiceImpl();
	private Order order = new Order();
	List<Coffee> coffeeList = null;
	Scanner in;

	public CoffeePrestImpl() {
		in = ScannerUtil.getScanner();
		try {
			coffeeList = coffeeService.getAllRecords();
		} catch (SQLException e) {
			System.out.println("Try Again!");
			e.printStackTrace();
		}
	}

	public void showMenu() {
		String spaces = "   ";
		String moreCoffee;

		System.out.println("Number\tCoffee" + "     " + "Small" + " " + "Medium" + " " + "Large");
//			coffeeService.getAllRecords()
//			.forEach(cf-> System.out.println(cf.getId() +"\t\t" +cf.getName()+"\t\t"+cf.getPrice()));
		do {
			for (Coffee cf : coffeeList) {
				System.out.format(cf.getId() + "\t" + cf.getName() + spaces + cf.getPrice() + spaces
						+ (cf.getPrice() + ADD_COFFEE_PRICE_MEDIUM) + spaces
						+ (cf.getPrice() + ADD_COFFEE_PRICE_LARGE));
				System.out.println();

				new SystemUtil().exit();
			}
			System.out.println("Choose option(1-4): ");
			int option = in.nextInt();
			System.out.println("Select Size (S-small M- medium L- large)");
			String size = in.next().toUpperCase();
			order.addCoffee(onOptionsItemSelected(option, size));

			System.out.println("Do you want Addons(Y-yes N- No)?");
			String addOn = in.next().toUpperCase();
			if (addOn.equals("Y"))
				showAddOnMenu();
			System.out.println("Do you want more coffee(Y-yes N-No)?");
			moreCoffee = in.next().toUpperCase();
		} while (moreCoffee.equals("N"));

	}

	@Override
	public Coffee onOptionsItemSelected(int option, String size) {
		Coffee coffee = coffeeList.get(option);

		switch (size) {
		case "M":
			coffee.setPrice(coffee.getPrice() + ADD_COFFEE_PRICE_MEDIUM);
			break;
		case "L":
			coffee.setPrice(coffee.getPrice() + ADD_COFFEE_PRICE_LARGE);
			break;
		}
		return coffee;

	}

	@Override
	public void showAddOnMenu() {

	}

}
