package com.expresso.service;

import java.sql.SQLException;

import com.expresso.bean.DiscountVoucher;

public interface DiscountService {
	
	DiscountVoucher findDiscountVoucherByName(String voucher) throws SQLException;

}
