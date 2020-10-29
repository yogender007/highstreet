package com.highstreet.prod;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.highstreet.promotions.BasketPromotionalRule;
import com.highstreet.promotions.IPromotionalRule;
import com.highstreet.promotions.LineItemRule;
import com.highstreet.service.HighStreetService;
import com.highstreet.service.HighStreetServiceImpl;
import com.highstreet.util.Util;
/**
 * 
 * Checkout class representing scan and total functionality
 *
 */
public class Checkout {
	
	List<IPromotionalRule> promotionalRules;
	private HashMap<String,OrderProduct> orderProducts = new HashMap<String,OrderProduct>();
	HighStreetService service = new HighStreetServiceImpl();
	
	public Checkout(List<IPromotionalRule> promotionalRules) {
		this.promotionalRules = promotionalRules;
	}
	
	public void scan(String productCode) { 
		OrderProduct orderProduct = orderProducts.get(productCode);
		if(orderProduct == null) {
			orderProduct = new OrderProduct(service.getProduct(productCode), 1);
			orderProducts.put(productCode, orderProduct);
		}else {
			orderProduct.incrementQuantity();
		}
	}
	
	public Double total() {
		double total = 0.0f;
		Collection<OrderProduct> orderProds = orderProducts.values();
		for (OrderProduct orderProduct : orderProds) {
			LineItemRule rule = Util.getLineItemPromotionFor(promotionalRules, orderProduct.productCode());
			total= total + orderProduct.getTotalPrice(rule);
		}
		
		BasketPromotionalRule basketRule = Util.getBasketPromotion(promotionalRules);
		if(basketRule !=null && total >= basketRule.getMinBasketPrice()) {
			total = (total - (total*basketRule.getDiscountPercentage()/100.0));
		}
		total = Math.round(total*100.0)/100.0;//round to 2 decimal places 
		return total;
	}

}
