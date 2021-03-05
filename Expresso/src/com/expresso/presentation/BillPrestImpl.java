package com.expresso.presentation;

import com.expresso.bean.Bill;
import com.expresso.bean.Coffee;
import com.expresso.bean.CoffeeAddOn;
import com.expresso.bean.Order;
import com.expresso.service.BillService;
import com.expresso.service.BillServiceImpl;

public class BillPrestImpl implements BillPrest {
	Bill bill = new Bill();
	BillService billService = new BillServiceImpl();
	

	@Override
	public void showBillInvoice(Order order) {
		bill = billService.calculateBill(order);
		
		System.out.println("--------------------------");
		System.out.println("     Expresso Caffe   \n");
		
		System.out.println("   Final Bill Invoice   ");
		System.out.println("Name: " + order.getCustomer().getName());
		
		System.out.println("Items      " + "   Price");
		
		
		for(Coffee cf : order.getCoffeeList()) {
			System.out.println(cf.getName()+" " +cf.getSize() +"      "+ cf.getPrice());
		}
		
		for(CoffeeAddOn addOn : order.getAddOnList()) {
			System.out.println(addOn.getName()+"             " + addOn.getPrice());
		}
		
		System.out.println("Total Value:" + bill.getTotalValue());
		System.out.println("Discount: " + bill.getDiscount());
		System.out.println("Net value: " + bill.getNetValue());
		System.out.println("GST:18%  " +bill.getGst() );
		System.out.println("Service Tax:8% " + bill.getServiceTax());
		System.out.println("Total Bill:" + bill.getTotalBill());
	}

}
