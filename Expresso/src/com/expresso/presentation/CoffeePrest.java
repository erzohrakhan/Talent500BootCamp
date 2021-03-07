package com.expresso.presentation;

import com.expresso.bean.Customer;
import com.expresso.bean.Order;

public interface CoffeePrest {
	public void showMenu(Customer customer);
	Order onOptionsItemSelected(int option, String Size);
}
