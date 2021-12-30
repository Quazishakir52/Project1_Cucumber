package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import wrappers.GenericWrappers;


public class WomenTshirtsPage extends GenericWrappers {
	
	public WomenTshirtsPage(){
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(xpath="//div[@class='right-block']")	
	WebElement ScrollToProduct;
	
	@FindBy(xpath="(//div[@id='layer_cart']//h2)[1]")	
	WebElement VerifyMessage;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")	
	WebElement clickProceedToCheckout;
	

	
	public WomenTshirtsPage scrollToProduct() throws InterruptedException{
		Thread.sleep(2000);
		getElementByXpath("//div[@class='right-block']");
		scrollToElement(ScrollToProduct);
		mouseOverByXpath("//div[@class='right-block']");
		clickByXpath("//span[contains(text(),'Add to cart')]");
		return this;
		
}
	
	public WomenTshirtsPage verifyMessage(String xpath, String text) throws InterruptedException{
		Thread.sleep(2000);
		getElementByXpath("(//div[@id='layer_cart']//h2)[1]");
		scrollToElement(VerifyMessage);
		verifyTextContainsByXpath("(//div[@id='layer_cart']//h2)[1]",text);
		System.out.print(text);
		return this;
	
}
	
	public OrderPage ClickProceedToCheckout() throws InterruptedException{
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Proceed to checkout')]");
		return new OrderPage();
		
}	

}