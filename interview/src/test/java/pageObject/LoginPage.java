package pageObject;

import elements.BaseElement;
import elements.Button;
import elements.TextBox;
import utility.FileHelper;
import webDriverFactory.WebDriverFactory;

public class LoginPage extends BasePage{
	
	private TextBox userName=null;
	private TextBox password=null;
	private Button login=null;
	
	
	public TextBox UserName()
	{
		userName=new TextBox(BaseElement.SelectBy.id,"email");
		return userName;
	}
	
	public TextBox Password()
	{
		password=new TextBox(BaseElement.SelectBy.id,"pass");
		return password;
	}
	public Button Login()
	{
		login=new Button(BaseElement.SelectBy.name,"login");
		return login;
	}
	
	public LoginPage() {
		
	}
	
	public void launchBrowser()
	{
		WebDriverFactory wdf=new WebDriverFactory();
		wdf.instantiateBrowser();
		String applicationName=FileHelper.readConfigValue("Application");
		WebDriverFactory.getCurrentWebDriver().get(applicationName);
		
	}

	@Override
	public void navigateTo() {
		launchBrowser();
	}
	
	public void login()
	{
		UserName().sendKeys(FileHelper.readConfigValue("UserName"));
		Password().sendKeys(FileHelper.readConfigValue("Password")); 
		Login().click();
		 
	}



}
