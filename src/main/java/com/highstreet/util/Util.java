package com.highstreet.util;

import java.util.List;

import com.highstreet.promotions.BasketPromotionalRule;
import com.highstreet.promotions.IPromotionalRule;
import com.highstreet.promotions.LineItemRule;

public class Util {
	
	public static BasketPromotionalRule getBasketPromotion(List<IPromotionalRule> activePromotions) {
		for (IPromotionalRule rule : activePromotions) {
			if(rule.isBasketRule()) {
				return (BasketPromotionalRule)rule;
			}
		}
		return null;
	}
	
	public static LineItemRule getLineItemPromotionFor(List<IPromotionalRule> activePromotions,String productCode) {
		for (IPromotionalRule rule : activePromotions) {
			if(!rule.isBasketRule()  && productCode.equals(rule.getProductCode())) {
				return(LineItemRule) rule;
			}
		}
		return null;
	}

}
