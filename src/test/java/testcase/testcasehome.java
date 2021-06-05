package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase_php;
import page.phpaccountpage;
import page.phphomepage;
import page.phploginpage;

public class testcasehome extends Testbase_php{
	
	phploginpage lp;
	phphomepage hp;
	phpaccountpage ac;

	public testcasehome() throws Exception {
		super();
		
	}
	@BeforeMethod
	public void starting1() throws Exception {
		System.out.println("validation is starting");
		first();
		lp = new phploginpage();
		hp = new phphomepage();
		ac= new phpaccountpage();
		hp = lp.pagelogin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Homepage is displayed successfully");
	}
	
	@AfterMethod
	public void ending1() {
		driver.quit();
		System.out.println("validation is over");
		
	}
	
	@Test(priority=1)
	public void hometest1() {
		
		String title=hp.homepagetitle();
		System.out.println("title of the page :"+title);
		
	}
	
	@Test(priority=2)
	public void hometest2() throws Exception {
		
	ac= hp.accountspage();
	System.out.println("account sign up page is displayed");
	driver.navigate().back();
	System.out.println("homepage is back");
	
		
	}
	
	@Test(priority=3)
	public void hometest4() {
		
	hp.homeout();
System.out.println("logged out successfully");
		
	}

}
