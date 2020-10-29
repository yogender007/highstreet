package com.highstreet.promotions;

public class BasketPromotionalRule implements IPromotionalRule{
	
	public float minBasketPrice;
	public float discountPercentage;

	public BasketPromotionalRule(float minBasketPrice, float discountPercentage) {
		this.minBasketPrice = minBasketPrice;
		this.discountPercentage = discountPercentage;
	}
	
	public boolean isBasketRule() {
		return true;
	}

	public String getProductCode() {
		return null;
	}

	public float getMinBasketPrice() {
		return minBasketPrice;
	}

	public float getDiscountPercentage() {
		return discountPercentage;
	}

	
}
