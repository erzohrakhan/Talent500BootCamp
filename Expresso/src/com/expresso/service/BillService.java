package com.expresso.service;

import com.expresso.bean.Bill;
import com.expresso.bean.Order;
import com.expresso.bean.OrderList;

public interface BillService {
	public static final float GST = .18f;
	public static final float SERVICE_TAX = .08f;

	void saveBillDetails();
	Bill calculateBill(OrderList orderList);
}
