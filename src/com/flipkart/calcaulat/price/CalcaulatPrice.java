package com.flipkart.calcaulat.price;

import java.util.List;

import com.flipkart.entity.ProductDTO;

//open close principle 
public interface CalcaulatPrice {

	public double calculateTotalPrice(List<ProductDTO> list);
}
