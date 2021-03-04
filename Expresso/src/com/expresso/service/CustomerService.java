package com.expresso.service;

import java.sql.SQLException;

import com.expresso.bean.Customer;

public interface CustomerService {
	public void saveCustomerDetails(Customer customer) throws SQLException;
	public void getCustomerName(String number);

}
