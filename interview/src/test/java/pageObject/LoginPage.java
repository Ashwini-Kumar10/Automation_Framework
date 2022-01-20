package pageObject;

import elements.BaseElement;
import elements.Button;
import elements.TextBox;
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
		
		/*
		 * System.setProperty("webdriver.driver.chrome",
		 * "C:\\Users\\Dyanda\\Desktop\\Interview\\interview\\src\\main\\resources\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.facebook.com");
		 */
		
		WebDriverFactory wdf=new WebDriverFactory();
		wdf.instantiateBrowser();
		wdf.getCurrentWebDriver().get("https://www.facebook.com");
		System.out.println("Ashwini");
		
		
		
	}

	@Override
	public void navigateTo() {
		//launchBrowser();
		
	}

	@Override
	boolean isOpen(String uniqueLocator) {
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
