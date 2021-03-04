package com.expresso.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.expresso.bean.Customer;

public interface CustomerService {
	public void saveCustomerDetails(Customer customer) throws SQLException;
	public Customer getCustomerByPhoneNumber(String number) throws SQLException;
	public List<Customer> getAllRecords() throws SQLException;

}
