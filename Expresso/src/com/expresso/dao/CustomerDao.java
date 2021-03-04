package com.expresso.dao;

import java.sql.SQLException;
import java.util.List;

import com.expresso.bean.Customer;

public interface CustomerDao {
	public void saveCustomerDetails(Customer customer) throws SQLException;
	public List<Customer> getAllRecords() throws SQLException;
	public Customer getCustomerByPhoneNumber(String number) throws SQLException;

}
