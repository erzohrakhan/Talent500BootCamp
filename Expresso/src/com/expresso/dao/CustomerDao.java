package com.expresso.dao;

import java.sql.SQLException;

import com.expresso.bean.Customer;

public interface CustomerDao {
	public void saveCustomerDetails(Customer customer) throws SQLException;
}
