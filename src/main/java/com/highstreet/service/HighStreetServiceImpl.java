package com.highstreet.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.highstreet.prod.Product;
import com.highstreet.promotions.BasketPromotionalRule;
import com.highstreet.promotions.IPromotionalRule;
import com.highstreet.promotions.LineItemRule;

public class HighStreetServiceImpl implements HighStreetService {

	public Map<String,Product> getAllProducts() {
		Map<String, Product> products = new HashMap<String,Product>();
		products.put("001",new Product("001", "Travel Card Holder", 9.25f));
		products.put("002",new Product("002", "Personalised cufflinks", 45.00f));
		products.put("003",new Product("003", "Kids T-shirt", 19.95f));
		return products;
	}

	public List<IPromotionalRule> getActivePromotions() {
		List<IPromotionalRule> activePromotions = new ArrayList<IPromotionalRule>();
		activePromotions.add(new BasketPromotionalRule(65.00f, 10.00f));
		activePromotions.add(new LineItemRule(2,8.50f, "001"));
		return activePromotions;
	}
	
	public Product getProduct(String productCode) {
		return getAllProducts().get(productCode);
	}

}
