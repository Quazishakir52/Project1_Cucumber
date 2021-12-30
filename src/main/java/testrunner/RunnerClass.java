package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/shakirquazi/Desktop/QA Clsss and automation testing/Eclipse IDE for Enterprise Java and Web Developers/Project1_Cucumber/src/main/java/feature", 
                 glue = "stepdefinitions", 
                 monochrome = true, 
                 dryRun = false, 
                 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json", 
                		    "html:target/cucumber-reports/Cucumber.html",
		                    "junit:target/cucumber-reports/Cucumber.xml" })

//plugin = {"html:reports/cucumber","json:reports/cucumber.json"})

public class RunnerClass {

}
