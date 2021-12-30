package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.WomenTshirtsPage;
import wrappers.GenericWrappers;

public class WomenTshirtsSteps extends GenericWrappers {
	
	WomenTshirtsPage womenTshirtsPage = new WomenTshirtsPage();
	
	
	@Then ("Scroll to product")
	public void scrollToProduct() throws InterruptedException {
		WomenTshirtsPage womenTshirtsPage = new WomenTshirtsPage();
		womenTshirtsPage.scrollToProduct();
	}
	
	@Then ("Verify Message")
	public void verifyMessage() throws InterruptedException {
		WomenTshirtsPage womenTshirtsPage = new WomenTshirtsPage();
		womenTshirtsPage.verifyMessage(null, null);	
		
	}
	
	@And ("Click Proceed to Chekcout")
	public void ClickProceedToCheckout() throws InterruptedException {
		WomenTshirtsPage womenTshirtsPage = new WomenTshirtsPage();
		womenTshirtsPage.ClickProceedToCheckout();
		
	}
}
