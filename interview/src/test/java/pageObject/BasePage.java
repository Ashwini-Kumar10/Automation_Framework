package pageObject;

public abstract class BasePage {
	
	//protected String uniqueLocator;
	abstract void navigateTo();
	abstract boolean isOpen(String uniqueLocator);

}
