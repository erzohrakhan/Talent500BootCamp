package com.expresso.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.expresso.bean.Coffee;
import com.expresso.bean.CoffeeAddOn;
import com.expresso.bean.Customer;
import com.expresso.bean.DiscountVoucher;
import com.expresso.bean.Order;
import com.expresso.bean.OrderList;
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

	private OrderList orderList = new OrderList();
	List<Coffee> coffeeList = null;
	List<CoffeeAddOn> addOnList = null;
	Scanner in;

	public CoffeePrestImpl() {
		in = ScannerUtil.getScanner();
		try {
			coffeeList = coffeeService.getAllRecords();
			addOnList = coffeeAddOnServ.getAllRecords();
		} catch (SQLException e) {
			System.out.println("Try Again!");
			// e.printStackTrace();
		}
	}

	@Override
	public void showMenu(Customer customer) {
		showCoffeAddOnMenu();
		DiscountVoucher disVoucher = disPrest.askDiscountVoucher();
		orderList.setDisVoucher(disVoucher);
		orderList.setCustomer(customer);
		billPrest.showBillInvoice(orderList);
	}

	private void showCoffeAddOnMenu() {
		String spaces = "   ";
		String moreCoffee;

//			coffeeService.getAllRecords()
//			.forEach(cf-> System.out.println(cf.getId() +"\t\t" +cf.getName()+"\t\t"+cf.getPrice()));
		do {
			Order order = null;
			System.out.println("Number\tCoffee" + "     " + "Small" + " " + "Medium" + " " + "Large");
			for (Coffee cf : coffeeList) {
				System.out.format(cf.getId() + "\t" + cf.getName() + spaces + cf.getPrice_small() + spaces
						+ cf.getPrice_med() + spaces + cf.getPrice_large());
				System.out.println();
			}
			System.out.println("Choose option(1-4): ");
			int option = in.nextInt();
			System.out.println("Select Size (S-small M- medium L- large)");
			String size = in.next().toUpperCase();
			order = onOptionsItemSelected(option, size);
			
			System.out.println("Do you want Addons(Y-yes N- No)?");
			String moreAddons;
			String addOn = in.next().toUpperCase();
			
			if (addOn.equals("Y")) {
				do {
					System.out.println("--------------------------------------------");
					System.out.println("Number" + "   " + "Add On" + "    " + "Price");

					for (CoffeeAddOn coffeeAddOn : addOnList) {
						System.out.println(coffeeAddOn.getId() + "       " + coffeeAddOn.getName() + "   " + coffeeAddOn.getPrice());
					}

					System.out.println("Choose option(1-4): ");
					int addOnOption = in.nextInt();
					order.setOrderName(order.getOrderName() + " " + addOnList.get(addOnOption - 1).getName());
					order.setPrice(order.getPrice() + addOnList.get(addOnOption - 1).getPrice());
					System.out.println("Do you want more Addons(Y-yes N- No)?");
					moreAddons = in.next().toUpperCase();
				} while (moreAddons.equals("Y"));
			}
			System.out.println("Do you want more coffee(Y-yes N-No)?");
			moreCoffee = in.next().toUpperCase();
			orderList.addOrder(order);
		} while (moreCoffee.equals("Y"));
	}

	@Override
	public Order onOptionsItemSelected(int option, String size) {
		Coffee coffee = coffeeList.get(option - 1);
		int price = 0;
		Order order = new Order();
		
		switch (size) {
		case "S":
			price = coffee.getPrice_small();
			break;
			
		case "M":
			price = coffee.getPrice_med();
			break;
		case "L":
			price = coffee.getPrice_large();
			break;
		}
		order.setOrderName(coffee.getName() + " " + size);
		order.setPrice(price);
		return order;

	}
}
