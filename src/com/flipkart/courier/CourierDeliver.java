package com.flipkart.courier;

import java.util.List;

import com.flipkart.entity.DeliveryDetails;
import com.flipkart.entity.ProductDTO;

public interface CourierDeliver extends Courier {
	
	public boolean deliverProduct(List<ProductDTO> products, DeliveryDetails deliveryDetails);
}
