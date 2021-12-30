package stepdefinitions;

import wrappers.GenericWrappers;
import io.cucumber.java.en.Given;

public class CommonSteps extends GenericWrappers {
	
	GenericWrappers wrapper = new GenericWrappers();
	
	@Given("Opening the browser")
	public void opening_the_browser() {
		wrapper.invokeApp("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

}
