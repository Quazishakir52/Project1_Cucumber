package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyAccountPage;
import wrappers.GenericWrappers;

public class MyAccountSteps extends GenericWrappers {
	
	MyAccountPage myAccountPage = new MyAccountPage();
	
	@When ("Clicking My Address")
	public void clickMyaddresses() throws InterruptedException {
		MyAccountPage myAccountPage = new MyAccountPage();
		myAccountPage.clickMyaddresses();
	} 
	
	@Then ("Click Womens Tshirts")
	public void mouseOverandclick() throws InterruptedException {
		MyAccountPage myAccountPage = new MyAccountPage();
		myAccountPage.mouseOverandclick();
	}
	

}
