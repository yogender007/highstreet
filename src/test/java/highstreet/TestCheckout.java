package highstreet;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import com.highstreet.prod.Checkout;
import com.highstreet.promotions.IPromotionalRule;
import com.highstreet.service.HighStreetService;
import com.highstreet.service.HighStreetServiceImpl;

public class TestCheckout {

	@Test
	public void testCheckOut() throws Exception {
		HighStreetService service = new HighStreetServiceImpl();
		List<IPromotionalRule> promotionalRules = service.getActivePromotions();
		
		Checkout checkout = new Checkout(promotionalRules);
		checkout.scan("001"); 
		checkout.scan("002");
		checkout.scan("003");
		assertEquals("The Expected value should be 66.78", 66.78, checkout.total(),0);
	}
	
	@Test
	public void testCheckOutScenario2() throws Exception {
		HighStreetService service = new HighStreetServiceImpl();
		List<IPromotionalRule> promotionalRules = service.getActivePromotions();
		
		Checkout checkout = new Checkout(promotionalRules);
		checkout.scan("001"); 
		checkout.scan("003");
		checkout.scan("001");
		assertEquals("The Expected value should be 36.95", 36.95, checkout.total(),0);
	}
}
