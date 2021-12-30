package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.UpdateAddressPage;
import wrappers.GenericWrappers;

public class UpdateAddressSteps extends GenericWrappers {
	
	UpdateAddressPage updateAddressPage = new UpdateAddressPage();
		
	
	@Then ("Enter City as \"([^\"]*)\"$")
	public void enterCity(String City) {
			updateAddressPage.enterCity(City);
		}
	
	@Then ("Select State as \"([^\"]*)\"$")	
	public void selectState(String State) {
			updateAddressPage.selectState(State);
		}
		
	@And  ("Click Save")	
	public void clickSave() {
			updateAddressPage.clickSave();
		}

}
