package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OrderPage;
import wrappers.GenericWrappers;

public class OrderSteps extends GenericWrappers{
	
	OrderPage orderPage = new OrderPage();
	
	@Then ("Validate product")
	public void validateProduct() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.validateProduct(null, null);
	}
	
	@And ("Click proceed to checkout1")
	public void clickProceedToCheckout1() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.clickProceedToCheckout1();
	}
	
	@And ("Click proceed to checkout2")
	public void clickProceedToCheckout2() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.clickProceedToCheckout2();
	}
	
	@And ("Click terms of service")
	public void clickTermsofService() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.clickTermsofService();
	}
	
	@And ("Click proceed to checkout3")
	public void clickProceedToCheckout3() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.clickProceedToCheckout3();
	}
	
	@Then ("Click Signout")
	public void Signout1() throws InterruptedException {
		OrderPage orderPage = new OrderPage();
		orderPage.Signout1();
	}
}	
