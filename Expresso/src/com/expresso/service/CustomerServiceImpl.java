package com.expresso.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.expresso.bean.Customer;
import com.expresso.dao.CustomerDao;
import com.expresso.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public void saveCustomerDetails(Customer customer) throws SQLException {
		customerDao.saveCustomerDetails(customer);
	}

	@Override
	public Customer getCustomerByPhoneNumber(String number) throws SQLException {
		return customerDao.getCustomerByPhoneNumber(number);

	}

}
