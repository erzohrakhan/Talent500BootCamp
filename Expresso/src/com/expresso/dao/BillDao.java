package com.expresso.dao;

import java.sql.SQLException;

import com.expresso.bean.Bill;

public interface BillDao {
	public void saveBillDetails(Bill bill) throws SQLException;
}
