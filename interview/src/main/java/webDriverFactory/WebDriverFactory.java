package webDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.FileHelper;

public class WebDriverFactory {

	static WebDriver driver;
	
	public void instantiateBrowser()
	{
		System.out.println(System.getProperty("user.dir"));
		String browserName=FileHelper.readConfigValue("Browser");
				//"Chrome";
		switch(browserName)
		{
		case "IE":
			//Do Nothing
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
					"\\src\\main\\resources\\Drivers\\chromedriver.exe");
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
	
	public static WebDriver getCurrentWebDriver()
	{
		return driver;
	}
	
}
