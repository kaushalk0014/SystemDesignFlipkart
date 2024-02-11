package com.flipkart.factory;

import com.flipkart.courier.Courier;
import com.flipkart.courier.DTDC;
import com.flipkart.courier.EKart;

public class SimpleCourierFactory implements CourierFactory{

	@Override
	public Courier getInstance(String type) {
		if(type==null||type.equals("")) {
			throw new IllegalArgumentException("Invalid Courier type:  " + type);
		}else if(type.equalsIgnoreCase("EKART")) {
			return new EKart();
		}else if(type.equalsIgnoreCase("DTDC")) {
			return new DTDC(); 
		}
		throw new IllegalArgumentException("Invalid Courier type:  " + type);
	}
}
