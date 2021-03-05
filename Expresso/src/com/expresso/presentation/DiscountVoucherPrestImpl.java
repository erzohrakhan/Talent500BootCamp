package com.expresso.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import com.expresso.bean.DiscountVoucher;
import com.expresso.service.DiscountService;
import com.expresso.service.DiscountServiceImpl;
import com.expresso.util.ScannerUtil;

public class DiscountVoucherPrestImpl implements DiscountVoucherPrest {
	Scanner in;
	DiscountService disServ = new DiscountServiceImpl();

	public DiscountVoucherPrestImpl() {
		in = ScannerUtil.getScanner();
	}

	@Override
	public DiscountVoucher askDiscountVoucher() {
		String choice;
		DiscountVoucher dis = null;

		System.out.println("Do you have any discount voucher(Y - Yes N - No)?");
		choice = in.next().toUpperCase();
		if (choice.equals("Y")) {
			System.out.println("Voucher no:");
			String voucher = in.next().toUpperCase();
			try {
				dis = disServ.findDiscountVoucherByName(voucher);
				if (dis == null) {
					System.out.println("Invalid Voucher");
				} else {
					System.out.println("Voila " + voucher + " applied successfully!");
				}
			} catch (SQLException e) {
				System.out.println("Invalid Voucher");
				// e.printStackTrace();
			}

		}

		return dis;

	}
}
