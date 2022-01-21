package pageObject;

public class HomePage extends BasePage{
	
	String xpathvalidator="fhjfghjgjhg";


	
	public HomePage() {
		
	}
	


	@Override
	public void navigateTo() {
		LoginPage lp=new LoginPage();
		lp.navigateTo();
		lp.login();
		HomePage hp=new HomePage();
		boolean b=(hp.isOpen(this.xpathvalidator))?true//log User is on Home Page
				:false//User is not on home Page
				;
		System.out.println(b);
		 }



}
