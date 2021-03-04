package com.expresso.service;

import java.sql.SQLException;

import com.expresso.bean.Customer;
import com.expresso.dao.CustomerDao;
import com.expresso.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public void saveCustomerDetails(Customer customer) throws SQLException {
		customerDao.saveCustomerDetails(customer);
	}

	@Override
	public void getCustomerName(String number) {
		
	}

}
