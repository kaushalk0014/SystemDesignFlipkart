package com.flipkart.calcaulat.price;

import java.util.List;

import com.flipkart.entity.ProductDTO;

public class CalculateWithOutGSTN implements CalcaulatPrice{
	
	@Override
	public double calculateTotalPrice(List<ProductDTO> list) {
		return 0;
	}
}
