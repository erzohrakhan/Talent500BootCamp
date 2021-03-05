package com.expresso.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.expresso.bean.Coffee;
import com.expresso.bean.CoffeeAddOn;
import com.expresso.bean.Customer;
import com.expresso.bean.DiscountVoucher;
import com.expresso.bean.Order;
import com.expresso.service.BillService;
import com.expresso.service.BillServiceImpl;
import com.expresso.service.CoffeAddOnServiceImpl;
import com.expresso.service.CoffeeAddOnService;
import com.expresso.service.CoffeeService;
import com.expresso.service.CoffeeServiceImpl;
import com.expresso.util.ScannerUtil;

public class CoffeePrestImpl implements CoffeePrest {
	private CoffeeService coffeeService = new CoffeeServiceImpl();
	private CoffeeAddOnService coffeeAddOnServ = new CoffeAddOnServiceImpl();
	private BillService billService = new BillServiceImpl();
	private BillPrest billPrest = new BillPrestImpl();
	private DiscountVoucherPrest disPrest = new DiscountVoucherPrestImpl();
	
	private Order order = new Order();
	List<Coffee> coffeeList = null;
	List<CoffeeAddOn> addOnList = null;
	Scanner in;

	public CoffeePrestImpl() {
		in = ScannerUtil.getScanner();
		try {
			coffeeList = coffeeService.getAllRecords();
			addOnList = coffeeAddOnServ.getAllRecords() ;
		} catch (SQLException e) {
			System.out.println("Try Again!");
			e.printStackTrace();
		}
	}
	
	@Override
	public void showMenu(Customer customer) {
		showCoffeAddOnMenu();	
		DiscountVoucher disVoucher = disPrest.askDiscountVoucher();
		order.setDisVoucher(disVoucher);
		order.setCustomer(customer);
		billPrest.showBillInvoice(order);
	}


	private void showCoffeAddOnMenu() {
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
		} while (moreCoffee.equals("Y"));
	}

	@Override
	public Coffee onOptionsItemSelected(int option, String size) {
		Coffee coffee = coffeeList.get(option-1);
		coffee.setSize(size);

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
		System.out.println("--------------------------------------------");
		System.out.println("Number"+"   "+"Add On"+"    "+"Price");

		for(CoffeeAddOn addOn : addOnList) {
			System.out.println(addOn.getId() +"       " + addOn.getName()+"   "+addOn.getPrice());
		}
		
		System.out.println("Choose option(1-4): ");
		int option = in.nextInt();
		order.addAddOn(addOnList.get(option-1));

	}

	
}
