package com.expresso.service;

import java.sql.SQLException;

import com.expresso.bean.DiscountVoucher;
import com.expresso.dao.DiscntVoucherDao;
import com.expresso.dao.DiscntVoucherDaoImpl;

public class DiscountServiceImpl implements DiscountService {
	DiscntVoucherDao disDao = new DiscntVoucherDaoImpl();

	@Override
	public DiscountVoucher findDiscountVoucherByName(String voucher) throws SQLException {
		return disDao.findDiscountVoucherByName(voucher);
	}

}
