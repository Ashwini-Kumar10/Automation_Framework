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
		try {
			classObject=Class.forName(absolutePageName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 method=Class.forName(absolutePageName).getDeclaredMethod("navigateTo");
			
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
		
		//System.out.format("Thread ID - %2d -%s from %s feature file.\n", Thread.currentThread().getId(),pageName,pageName);
		/*
		 * Class<?> pageClass = ("pageObject."+pageName).getClass(); Object xyz =
		 * Class.forName("pageObject."+pageName).newInstance(); String
		 * className=pageClass.getName(); System.out.println(className); Method method =
		 * pageClass.getDeclaredMethod("navigateTo"); Object returnv=method.invoke(xyz);
		 */
		
		  //LoginPage lp=new LoginPage(); lp.navigateTo();
		 
	}
	



}
