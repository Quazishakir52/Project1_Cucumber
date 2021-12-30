package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers {
	
	
	LoginPage loginPage = new LoginPage();

	@And("Enter username")
	public void enterUserName() {
		loginPage.enterUserName();
	}

	@And("Enter password")
	public void enterPassword() {
		loginPage.enterPassword();
	}

	@Then("Click login")
	public void clickLogin() {
		loginPage.clickLogin();
	}

}

