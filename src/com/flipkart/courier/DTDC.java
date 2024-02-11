package com.flipkart.courier;

import java.util.List;

import com.flipkart.entity.CourierDTO;
import com.flipkart.entity.DeliveryDetails;
import com.flipkart.entity.ProductDTO;

public class DTDC implements CourierDeliver, CourierReturn {

	@Override
	public boolean deliverProduct(List<ProductDTO> products, DeliveryDetails deliveryDetails) {
		return false;
	}

	@Override
	public boolean returnProduct(List<ProductDTO> products, DeliveryDetails deliveryDetails) {
		return false;
	}

	@Override
	public Boolean registerCompany(CourierDTO courierDTO) {
		return false;
	}
}
