package com.highstreet.service;

import java.util.List;
import java.util.Map;

import com.highstreet.prod.Product;
import com.highstreet.promotions.IPromotionalRule;

public interface HighStreetService {

	public Map<String,Product> getAllProducts();
	public List<IPromotionalRule> getActivePromotions();
	public Product getProduct(String productCode);
}
