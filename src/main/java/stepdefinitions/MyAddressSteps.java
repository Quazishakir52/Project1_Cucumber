package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MyAddressesPage;
import wrappers.GenericWrappers;

public class MyAddressSteps extends GenericWrappers {
	
	MyAddressesPage myAddressesPage = new MyAddressesPage();

	@Then ("Click Update")
	public void ClickUpdate() throws InterruptedException {
		MyAddressesPage myAddressesPage = new MyAddressesPage();
		myAddressesPage.ClickUpdate();
	}
	
	@And ("Verify City")
	public void VerifyCity() throws InterruptedException {
		MyAddressesPage myAddressesPage = new MyAddressesPage();
		myAddressesPage.VerifyCity(null);
	}
	
	@And ("Verify State")
	public void VerifyState() throws InterruptedException {
		MyAddressesPage myAddressesPage = new MyAddressesPage();
		myAddressesPage.VerifyState(null);
	}
	
	@And ("Click Logout")
	public void Signout() throws InterruptedException {
		MyAddressesPage myAddressesPage = new MyAddressesPage();
		myAddressesPage.Signout();
		}
	
	}

