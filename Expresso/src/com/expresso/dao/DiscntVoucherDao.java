package com.expresso.dao;

import java.sql.SQLException;

import com.expresso.bean.DiscountVoucher;

public interface DiscntVoucherDao {
	
	public DiscountVoucher findDiscountVoucherByName(String voucher) throws SQLException;

}
