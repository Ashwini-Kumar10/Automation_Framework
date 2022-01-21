package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webDriverFactory.WebDriverFactory;

public class BaseElement {
	
	public enum SelectBy{className,cssSelector,id,linkText,partialLinkText,tagName,xPath,name}
	protected SelectBy locatorType;
	protected String locatorValue;
	
	public SelectBy getLocatorType()
	{
		return locatorType;
	}
	
	public void setLocatorType(SelectBy LocatorType)
	{
		this.locatorType=LocatorType;
	}
	
	public String getLocatorValue()
	{
		return locatorValue;
	}
	
	public void setLocatorValue(String LocatorValue)
	{
		this.locatorValue=LocatorValue;
	}
	
	public WebElement findElement()
	{
		WebElement element =null;
		
		switch(locatorType) 
		{
		
			case className:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.className(locatorValue));
				break;
			case cssSelector:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.cssSelector(locatorValue));
				break;
			case id:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.id(locatorValue));
				break;
			case linkText:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.linkText(locatorValue));
				break;
			case partialLinkText:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.partialLinkText(locatorValue));
				break;
			case tagName:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.tagName(locatorValue));
				break;
			case xPath:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.xpath(locatorValue));
				break;
			case name:
				element=WebDriverFactory.getCurrentWebDriver().findElement(By.name(locatorValue));
				break;
			default:
					//do nothing
				break;
		}
		return element;
	}
	}
	
	
	
	
	
	


