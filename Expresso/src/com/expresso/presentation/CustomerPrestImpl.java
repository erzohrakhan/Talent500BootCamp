package com.expresso.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import com.expresso.bean.Customer;
import com.expresso.service.CustomerService;
import com.expresso.service.CustomerServiceImpl;
import com.expresso.util.ScannerUtil;

public class CustomerPrestImpl implements CustomerPrest{
	CoffeePrest coffeePrest = new CoffeePrestImpl();
	CustomerService customerServ = new CustomerServiceImpl();
	

	@Override
	public void enterDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerDetails() {
		Scanner in = ScannerUtil.getScanner();
		String number;
		String name;
		System.out.println("Enter phone number:");
		number = in.next();
		//To do if this phone exists then no need to ask for name
		//TO DO save customer
		System.out.println("Enter name:");
		name = in.next();
		try {
			customerServ.saveCustomerDetails(new Customer(name, number));
		} catch (SQLException e) {
			System.out.println("Something went wrong. Try again!");
		}
		
	}

}
