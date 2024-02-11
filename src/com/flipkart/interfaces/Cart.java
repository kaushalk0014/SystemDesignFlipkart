package com.flipkart.interfaces;

import com.flipkart.entity.ProductDTO;

public interface Cart {
	
	public int addProduct(ProductDTO item);
	public int removeProduct(ProductDTO item);
	
}
