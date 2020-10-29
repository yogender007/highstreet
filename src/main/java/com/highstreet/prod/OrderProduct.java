package com.highstreet.prod;

import com.highstreet.promotions.LineItemRule;

/**
 * 
 * Orders placed by customers for Product
 *
 */
public class OrderProduct {
	
	private Product product;
	private int quantity;

	public OrderProduct(Product product,int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public void incrementQuantity() {
		quantity= quantity+1;
	}
	
	public String productCode(){
		return product.getProductCode();
	}

	public float getTotalPrice(LineItemRule rule) {
		float price = product.getPrice();
		if(rule!=null && quantity >= rule.getMinQuantity()) {		
				price = rule.getNewPrice();
		}
		return price*quantity;
	}
	
}
