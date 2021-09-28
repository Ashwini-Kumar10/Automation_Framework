package webDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

	WebDriver driver;
	
	public void instantiateBrowser()
	{
		String browserName="Chrome";
		switch(browserName)
		{
		case "IE":
			//Do Nothing
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Dyanda\\Desktop\\Interview\\interview\\src\\main\\resources\\Drivers\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--no-sandbox");
			co.addArguments("--start-maximized");
			driver=new ChromeDriver(co);
			break;
		default:
			//Do nothing
			break;
		}
	}
	
	public WebDriver getCurrentWebDriver()
	{
		return driver;
	}
	
}
