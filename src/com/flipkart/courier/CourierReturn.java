package com.flipkart.courier;

import java.util.List;

import com.flipkart.entity.DeliveryDetails;
import com.flipkart.entity.ProductDTO;

public interface CourierReturn extends Courier {
	
	public boolean returnProduct(List<ProductDTO> products, DeliveryDetails  deliveryDetails);
}
