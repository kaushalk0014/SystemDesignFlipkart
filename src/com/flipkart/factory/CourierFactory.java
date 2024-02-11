package com.flipkart.factory;

import com.flipkart.courier.Courier;

public interface CourierFactory {

	public Courier getInstance(String type);
}
