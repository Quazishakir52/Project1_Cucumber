package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wrappers.GenericWrappers;


public class MyAccountPage extends GenericWrappers  {

	public MyAccountPage(){
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(xpath="//span[contains(text(),'My addresses')]")	
	WebElement ClickMyaddresses;
	
	@FindBy(xpath="//a[@title='Women']")	
	WebElement MouseOverWomen;
	
	@FindBy(xpath="//a[@title='T-shirts'][1]")	
	WebElement clickWomenTTshirts;
	
	
	
	public MyAddressesPage clickMyaddresses() throws InterruptedException{
		Thread.sleep(2000);
		scrollToElement(ClickMyaddresses);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'My addresses')]");
		return new MyAddressesPage(); 
	}	
	
	public WomenTshirtsPage mouseOverandclick() throws InterruptedException{
		Thread.sleep(2000);
		getElementByXpath("//a[@title='Women']");
		mouseOverByXpath("//a[@title='Women']");
		clickByXpath("//a[@title='T-shirts'][1]");
		return new WomenTshirtsPage(); 
		
	
	}
	


}