package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.expresso.bean.Bill;
import com.expresso.util.SqlConnectionUtil;

public class BillDaoImpl implements BillDao {
	Connection con;

	@Override
	public void saveBillDetails(Bill bill) throws SQLException {
		con = SqlConnectionUtil.getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"INSERT INTO BILL(BILL_DATE,TOTALVALUE,DISCOUNT,NETVALUE,TOTALBILL,GST,SERVICE_TAX,CUSTOMER_ID VALUES(?,?,?,?,?,?)");
		st.setDate(1, bill.getDate());
		st.setInt(2, bill.getTotalValue());
		st.setInt(3, bill.getDiscount());
		st.setInt(4, bill.getNetValue());
		st.setInt(5, bill.getTotalBill());
		st.setInt(6, bill.getGst());
		st.setInt(7, bill.getServiceTax());
		st.setInt(8, bill.getDiscount());
		st.executeUpdate();
		con.close();

	}

}
