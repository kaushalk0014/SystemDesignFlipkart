package com.flipkart.utils;

import java.util.Random;

public class RandomNumber {
	public static int getNumber() {
		// create instance of Random class
		Random random = new Random();
		// Generate random integers in range 999999
		return 100000 + random.nextInt(900000);
		
		
	}
}
