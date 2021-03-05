package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.CoffeeAddOn;
import com.expresso.util.SqlConnectionUtil;

public class CoffeAddOnDaoImpl implements CoffeeAddOnDao {
	Connection con = null;

	@Override
	public ArrayList<CoffeeAddOn> getAllRecords() throws SQLException {
		ArrayList<CoffeeAddOn> coffeeAddOnList = new ArrayList<CoffeeAddOn>();
		con = SqlConnectionUtil.getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM ADDON");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			CoffeeAddOn ca = new CoffeeAddOn();
			ca.setId(resultSet.getInt("id"));
			ca.setName(resultSet.getString("type"));
			ca.setPrice(resultSet.getInt("price"));

			coffeeAddOnList.add(ca);
		}
		con.close();

		return coffeeAddOnList;
	}

	@Override
	public int getCoffeeAddOnPriceById() {
		// TODO Auto-generated method stub
		return 0;
	}

}
