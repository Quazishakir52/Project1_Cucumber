package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import wrappers.GenericWrappers;


public class LoginPage extends GenericWrappers  {

	public LoginPage(){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="email")	
	WebElement username;
	
	@FindBy(id="passwd")	
	WebElement password;
	
	@FindBy(id="SubmitLogin")	
	WebElement loginButton;
	
	
	
	public LoginPage enterUserName(){
		enterById("userName", UN);
		//username.sendKeys("test");
		return this;
	}
	
	
	public LoginPage enterPassword(){
		password.sendKeys(prop.getProperty("PW"));
		return this;
	}
	
	public MyAccountPage clickLogin(){
		clickById("SubmitLogin");		
		return new MyAccountPage();
	}	
	

}
