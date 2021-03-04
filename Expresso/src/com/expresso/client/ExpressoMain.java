package com.expresso.client;

import com.expresso.presentation.CustomerPrest;
import com.expresso.presentation.CustomerPrestImpl;


public class ExpressoMain {
	public static void main(String[] args) {
		CustomerPrest customerPrest = new CustomerPrestImpl();
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to Expresso Caffe");
		customerPrest.getCustomerDetails();
	}

}
