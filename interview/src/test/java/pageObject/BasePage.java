package pageObject;




import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	//protected String uniqueLocator;
	abstract void navigateTo();
	 boolean isOpen(String uniqueLocator)
	 {
		 WebDriver driver=webDriverFactory.WebDriverFactory.getCurrentWebDriver();
		 try
		 {
			 if(driver.findElement(By.xpath(uniqueLocator)) !=null)
		
		 {
			 return true;
		 }
		 }
			 catch(NoSuchElementException e)
			 {
				 return false; 
			 }
		return false;
		
		 
	 };

}
