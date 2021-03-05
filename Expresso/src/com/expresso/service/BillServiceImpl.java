package com.expresso.service;

import java.sql.Date;

import com.expresso.bean.Bill;
import com.expresso.bean.Coffee;
import com.expresso.bean.CoffeeAddOn;
import com.expresso.bean.Order;
import com.expresso.dao.BillDao;
import com.expresso.dao.BillDaoImpl;

public class BillServiceImpl implements BillService {
	BillDao billDao = new BillDaoImpl();

	@Override
	public void saveBillDetails() {
		billDao.saveBillDetails();
	}

	@Override
	public Bill calculateBill(Order order) {
		int sum = 0;
		int discount = 0;
		// Date date = new Date(System.currentTimeMillis());

		for (Coffee cf : order.getCoffeeList()) {
			sum += cf.getPrice();
		}

		for (CoffeeAddOn addOn : order.getAddOnList()) {
			sum += addOn.getPrice();
		}
		if (order.getDisVoucher() != null)
			discount = sum * order.getDisVoucher().getDiscountRate() / 100;
		int netValue = sum - discount;
		int gst = (int) (netValue * GST);
		int servTax = (int) (netValue * SERVICE_TAX);
		int totalBill = (int) (netValue + gst + servTax);

		return new Bill(sum, discount, netValue, totalBill, gst, servTax);
	}

}
