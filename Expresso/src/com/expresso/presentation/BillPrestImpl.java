package com.expresso.presentation;

import java.sql.SQLException;
import java.time.LocalDate;

import com.expresso.bean.Bill;
import com.expresso.bean.Order;
import com.expresso.bean.OrderList;
import com.expresso.service.BillService;
import com.expresso.service.BillServiceImpl;

public class BillPrestImpl implements BillPrest {
	Bill bill = new Bill();
	BillService billService = new BillServiceImpl();

	@Override
	public void showBillInvoice(OrderList orderList) {

		bill = billService.calculateBill(orderList);
		LocalDate date = LocalDate.now();
		java.sql.Date sqlDate = java.sql.Date.valueOf(date);
		bill.setDate(sqlDate);

		System.out.println("--------------------------");
		System.out.println("     Expresso Caffe   \n");

		System.out.println("   Final Bill Invoice   ");
		System.out.println("Name: " + orderList.getCustomer().getName() + "    Date:" + date);

		System.out.println("Items      " + "   Price");

		for (Order order : orderList.getOrderList()) {
			System.out.println(order.getOrderName() + "   " + order.getPrice());
		}

		System.out.println("Total Value:" + bill.getTotalValue());
		System.out.println("Discount: " + bill.getDiscount());
		System.out.println("Net value: " + bill.getNetValue());
		System.out.println("GST:18%  " + bill.getGst());
		System.out.println("Service Tax:8% " + bill.getServiceTax());
		System.out.println("Total Bill:" + bill.getTotalBill());

		System.out.println("GoodBye... Have a nice day!");
		try {
			billService.saveBillDetails(bill);
		} catch (SQLException e) {

		}
	}

}
