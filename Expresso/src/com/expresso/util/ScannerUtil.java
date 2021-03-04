package com.expresso.util;

import java.util.Scanner;

public class ScannerUtil {
	private static Scanner in = null;
	
	private ScannerUtil() {
		
	}

	public static Scanner getScanner() {
		synchronized (in) {
			if (in == null) {
				in = new Scanner(System.in);
			}
		}

		return in;
	}
}
