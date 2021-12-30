package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import wrappers.GenericWrappers;


public class OrderPage extends GenericWrappers {

	public OrderPage(){
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(xpath="//td[@class='cart_description']")	
	WebElement ValidateProduct;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")	
	WebElement ClickProceedToCheckout1;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")	
	WebElement ClickProceedToCheckout2;
	
	@FindBy(xpath="//input[@id='cgv']")	
	WebElement ClickTermsofService;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")	
	WebElement ClickProceedToCheckout3;
	
	@FindBy(xpath="//a[@class='logout']")	
	WebElement signout1;
	
	
 	
	


public OrderPage validateProduct (String xpath1, String text1) throws InterruptedException{
	scrollToElement(ValidateProduct);
	verifyTextContainsByXpath("//td[@class='cart_description']", text1); 
	System.out.print(text1);
	return this;
	
	}


public OrderPage clickProceedToCheckout1() throws InterruptedException{
	clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;
	
	}
	
public OrderPage clickProceedToCheckout2() throws InterruptedException{
		clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;	
	
	
	}

public OrderPage clickTermsofService() throws InterruptedException{
	clickByXpath("//input[@id='cgv']");
	return this;	
	
	}

public OrderPage clickProceedToCheckout3() throws InterruptedException{
	clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;
	

	}

public OrderPage Signout1() throws InterruptedException{
	Thread.sleep(2000);
	scrollToElement(signout1);
	Thread.sleep(2000);
	clickByXpath("//a[@class='logout']");
	return this;
	
	}
	

}
