package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = {
	            		
//				".//Featurefiles//",
				".//Featurefiles/Login.feature",
//				".//Featurefiles/Register.feature"
						
		         },
	    glue={"stepdefinitions","hooks"},
	    publish = true,
		dryRun = false,
		monochrome = true,
	
		plugin = {"pretty",
				
				"html:target/HTML-Reports.html",
				"json:target/JSON_Reports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",			
		})
public class TestRunner
	

{

}
