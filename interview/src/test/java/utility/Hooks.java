package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import webDriverFactory.WebDriverFactory;

public class Hooks {
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        WebDriverFactory wdf=new WebDriverFactory();
		wdf.instantiateBrowser();
		wdf.getCurrentWebDriver().get("https://www.facebook.com");
		System.out.println("Ashwini");
    }	
	
	@After
    public void afterScenario(){
        //System.out.println("This will run after the Scenario");
    }

}
