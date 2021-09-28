package elements;

import org.openqa.selenium.WebElement;

public class Button extends BaseElement {

	public Button(SelectBy LocatorType,String LocatorValue)
	{
		this.locatorType=LocatorType;
		this.locatorValue=LocatorValue;
	}
	
	public void click()
	{
		WebElement element=findElement();
		element.click();
	}
	
	
	
}
