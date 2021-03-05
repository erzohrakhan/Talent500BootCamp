package com.expresso.presentation;

import com.expresso.bean.Coffee;
import com.expresso.bean.Customer;

public interface CoffeePrest {
	public void showMenu(Customer customer);
	public void showAddOnMenu();
	Coffee onOptionsItemSelected(int option, String Size);

	
	public static final int ADD_COFFEE_PRICE_MEDIUM = 50;
	public static final int ADD_COFFEE_PRICE_LARGE = 100;

}
