package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wrappers.GenericWrappers;


public class MyAddressesPage extends GenericWrappers{
	
	public MyAddressesPage(){
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(xpath="//span[contains(text(),'Update')]")	
	WebElement clickUpdate;
	
	@FindBy(xpath="//span[contains(text(),'Toronto')]")	
	WebElement verifyCity;
	
	@FindBy(xpath="//span[contains(text(),'Washington')]")	
	WebElement verifyState;
	
	@FindBy(xpath="//a[@class='logout']")	
	WebElement signout;

	
	public UpdateAddressPage ClickUpdate() throws InterruptedException{
		Thread.sleep(2000);
		scrollToElement(clickUpdate);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Update')]");
		return new UpdateAddressPage(); 
	}	
	
	public MyAddressesPage VerifyCity(String city) throws InterruptedException{
		verifyTextContainsByXpath("//span[contains(text(),'Toronto')]", city);
		System.out.print(city);
		return this;
	}
	
	public MyAddressesPage VerifyState(String State) throws InterruptedException{
		verifyTextContainsByXpath("//span[contains(text(),'Washington')]", State);
		System.out.print(State);
		return this;
		
	}	
	
	public LoginPage Signout() throws InterruptedException{
		Thread.sleep(2000);
		scrollToElement(signout);
		Thread.sleep(2000);
		clickByXpath("//a[@class='logout']");
		return new LoginPage(); 
	
	}
	
}


