package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.expresso.bean.Customer;
import com.expresso.util.SqlConnectionUtil;

public class CustomerDaoImpl implements CustomerDao{
	Connection con;

	@Override
	public void saveCustomerDetails(Customer customer) throws SQLException {
		con = SqlConnectionUtil.getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO CUSTOMER(NAME,PHONE_NO) VALUES(?,?)");
		st.setString(1, customer.getName());
		st.setString(2, customer.getPhoneNo());
		st.executeUpdate();
		con.close();
		
	}

	@Override
	public Customer getCustomerByPhoneNumber(String number) throws SQLException {
		con = SqlConnectionUtil.getConnection();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM CUSTOMER WHERE PHONE_NO =" + number);
		ResultSet resultSet = stmt.executeQuery();
		Customer cust = null;
		while(resultSet.next()) {
			cust = new Customer();
			cust.setId(resultSet.getInt("id"));
			cust.setName(resultSet.getString("name"));
			cust.setPhoneNo(resultSet.getString("phone_no"));
			
		}
		con.close();
		return cust;
	}

}
