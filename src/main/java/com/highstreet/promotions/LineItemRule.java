package com.highstreet.promotions;

/**
 * 
 * Line item rule
 *
 */
public class LineItemRule implements IPromotionalRule{
	
	private int minQuantity;
	private float newPrice;
	private String productCode;
	
	public LineItemRule(int minQuantity, float newPrice, String productCode) {
		this.minQuantity = minQuantity;
		this.newPrice = newPrice;
		this.productCode = productCode;
	}

	public boolean isBasketRule() {
		return false;
	}

	public String getProductCode() {
		return productCode;
	}

	public int getMinQuantity() {
		return minQuantity;
	}

	public float getNewPrice() {
		return newPrice;
	}
	
}
