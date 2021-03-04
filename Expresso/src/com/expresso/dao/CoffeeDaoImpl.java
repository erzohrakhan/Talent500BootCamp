package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.expresso.bean.Coffee;
import com.expresso.util.SqlConnectionUtil;

public class CoffeeDaoImpl implements CoffeeDao {
	Connection con;

	@Override
	public ArrayList<Coffee> getAllRecords() throws SQLException {
		ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();
		con = SqlConnectionUtil.getConnection();
		PreparedStatement statement = con.prepareStatement("SELECT * FROM COFFEE_TYPE");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			Coffee cf = new Coffee();
			cf.setId(resultSet.getInt("id"));
			cf.setName(resultSet.getString("name"));
			cf.setPrice(resultSet.getInt("price"));
			coffeeList.add(cf);
			//System.out.println(cf.toString());
		}
		con.close();

		return coffeeList;
	}

	@Override
	public int getCoffeePriceByName() {
		// TODO Auto-generated method stub
		return 0;
	}

}
