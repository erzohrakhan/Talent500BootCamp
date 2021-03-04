package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.expresso.bean.Customer;
import com.expresso.util.SqlConnectionUtil;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public void saveCustomerDetails(Customer customer) throws SQLException {
		Connection con = SqlConnectionUtil.getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?)");
		st.setString(2, customer.getName());
		st.setString(3, customer.getPhoneNo());
		int rows = st.executeUpdate();
		System.out.println("rows " + rows);
		con.close();
		
	}

}
