package com.expresso.presentation;

import com.expresso.bean.Coffee;

public interface CoffeePrest {
	public void showMenu();
	public void showAddOnMenu();
	Coffee onOptionsItemSelected(int option, String Size);

	
	public static final int ADD_COFFEE_PRICE_MEDIUM = 50;
	public static final int ADD_COFFEE_PRICE_LARGE = 100;

}
