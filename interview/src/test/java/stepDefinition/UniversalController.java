package stepDefinition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import io.cucumber.java.en.Given;

public class UniversalController {
	

	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		System.out.println(pageName);
		Object classObject=null;
		Method method=null;
		String absolutePageName="pageObject."+pageName;
		System.out.println(absolutePageName);
		try {
			classObject=Class.forName(absolutePageName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 method=Class.forName(absolutePageName).getDeclaredMethod("navigateTo");
			 System.out.println(method.getName());
			
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			method.invoke(classObject);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 
	}
	



}
