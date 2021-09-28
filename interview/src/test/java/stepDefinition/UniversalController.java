package stepDefinition;

import io.cucumber.java.en.Given;
import pageObject.LoginPage;

public class UniversalController {
	

	@Given("User is on {string}")
	public void user_is_on(String string) {
		LoginPage lp=new LoginPage();
		lp.navigateTo();
	}




}
