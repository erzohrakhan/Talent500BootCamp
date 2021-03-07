package com.expresso.service;

import java.sql.SQLException;

import com.expresso.bean.Bill;

import com.expresso.bean.Order;
import com.expresso.bean.OrderList;
import com.expresso.dao.BillDao;
import com.expresso.dao.BillDaoImpl;

public class BillServiceImpl implements BillService {
	BillDao billDao = new BillDaoImpl();
	

	@Override
	public void saveBillDetails(Bill bill) throws SQLException {
		System.out.println(bill.toString());
		billDao.saveBillDetails(bill);
	}

	@Override
	public Bill calculateBill(OrderList orderList) {
		int sum = 0;
		int discount = 0;

		for (Order order : orderList.getOrderList()) {
			sum += order.getPrice();
		}

		if (orderList.getDisVoucher() != null)
			discount = sum * orderList.getDisVoucher().getDiscountRate() / 100;
		int netValue = sum - discount;
		int gst = (int) (netValue * GST);
		int servTax = (int) (netValue * SERVICE_TAX);
		int totalBill = (int) (netValue + gst + servTax);

		return new Bill(sum, discount, netValue, totalBill, gst, servTax,orderList.getCustomer().getId());
	}

}
