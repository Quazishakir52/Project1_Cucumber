package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import wrappers.GenericWrappers;


public class UpdateAddressPage extends GenericWrappers{
	
	public UpdateAddressPage(){
		PageFactory.initElements(driver, this);	
		
	}
		
		@FindBy(xpath="//input[@id='city']")	
		WebElement EnterCity;
		
		@FindBy(id="id_state")	
		WebElement SelectState;
		
		@FindBy(id="submitAddress")	
		WebElement ClickSave;
	
		
	
	public UpdateAddressPage enterCity(String city){
		enterByXpath("//input[@id='city']",city);
		return this; 
	}
	
	public UpdateAddressPage selectState(String State){
		selectVisibileTextById("id_state", State);
		return this; 
		
	}
	
	public MyAddressesPage clickSave(){
		clickById("submitAddress");
		return new MyAddressesPage();
		
	}

}
