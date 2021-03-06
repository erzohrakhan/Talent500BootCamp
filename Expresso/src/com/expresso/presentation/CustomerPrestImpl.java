package com.expresso.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import com.expresso.bean.Customer;
import com.expresso.service.CustomerService;
import com.expresso.service.CustomerServiceImpl;
import com.expresso.util.ScannerUtil;

public class CustomerPrestImpl implements CustomerPrest {
	CoffeePrest coffeePrest = new CoffeePrestImpl();
	CustomerService customerServ = new CustomerServiceImpl();

	@Override
	public void getCustomerDetails() {
		Scanner in = ScannerUtil.getScanner();
		String number;
		String name = "";
		System.out.println("Enter phone number:");
		number = in.next();
		// To do if this phone exists then no need to ask for name
		// TO DO save customer
		Customer customer = null;
		try {
			customer = getCustomerIfPresent(number);
			if (customer == null) {
				System.out.println("Enter name:");
				name = in.next();
				customer = new Customer(name, number);
				customerServ.saveCustomerDetails(customer);
			}
		} catch (SQLException e) {
			System.out.println("Something went wrong. Try again!");
			e.printStackTrace();
//			new SystemUtil().exit();
			
		}
		
		System.out.println("Hi "+ customer.getName() +" !");
		
		coffeePrest.showMenu(customer);

	}

	private Customer getCustomerIfPresent(String number) throws SQLException {
		Customer customer = customerServ.getCustomerByPhoneNumber(number);

		return customer;

	}

}
