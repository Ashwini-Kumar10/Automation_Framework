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
		WebDriverFactory wdf=new WebDriverFactory();
		switch(locatorType) 
		{
		
			case className:
				element=wdf.getCurrentWebDriver().findElement(By.className(locatorValue));
				break;
			case cssSelector:
				element=wdf.getCurrentWebDriver().findElement(By.cssSelector(locatorValue));
				break;
			case id:
				element=wdf.getCurrentWebDriver().findElement(By.id(locatorValue));
				break;
			case linkText:
				element=wdf.getCurrentWebDriver().findElement(By.linkText(locatorValue));
				break;
			case partialLinkText:
				element=wdf.getCurrentWebDriver().findElement(By.partialLinkText(locatorValue));
				break;
			case tagName:
				element=wdf.getCurrentWebDriver().findElement(By.tagName(locatorValue));
				break;
			case xPath:
				element=wdf.getCurrentWebDriver().findElement(By.xpath(locatorValue));
				break;
			case name:
				element=wdf.getCurrentWebDriver().findElement(By.name(locatorValue));
				break;
			default:
					//do nothing
				break;
		}
		return element;
	}
	}
	
	
	
	
	
	


