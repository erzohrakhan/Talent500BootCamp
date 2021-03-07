package com.expresso.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.expresso.bean.DiscountVoucher;
import com.expresso.util.SqlConnectionUtil;

public class DiscntVoucherDaoImpl implements DiscntVoucherDao {
	Connection con;

	@Override
	public DiscountVoucher findDiscountVoucherByName(String voucher) throws SQLException {
		DiscountVoucher disVoucher = null;
		con = SqlConnectionUtil.getConnection();
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM DISCOUNT_VOUCHER WHERE VOUCHER ="+voucher);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			disVoucher = new DiscountVoucher();
			disVoucher.setId(resultSet.getInt("id"));
			disVoucher.setDiscountVoucher(resultSet.getString("voucher"));
			disVoucher.setDiscountRate(resultSet.getInt("discount_rate"));

		}
		con.close();
		return disVoucher;
	}

}
