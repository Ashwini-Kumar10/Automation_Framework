package elements;

import org.openqa.selenium.WebElement;

public class TextBox extends BaseElement {

	public TextBox(SelectBy LocatorType,String LocatorValue)
	{
		this.locatorType=LocatorType;
		this.locatorValue=LocatorValue;
	}
	
	public void click()
	{
		WebElement element=findElement();
		element.click();
	}
	
	public void sendKeys(String input)
	{
		WebElement element=findElement();
		element.sendKeys(input);
	}
	

}
