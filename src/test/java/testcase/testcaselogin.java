package testcase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase_php;
import page.phphomepage;
import page.phploginpage;
public class testcaselogin extends Testbase_php {
	
	phploginpage lp;
	phphomepage hp;

	public testcaselogin() throws Exception {
		super();
	}
	
	@BeforeMethod
	public void starting() throws Exception {
		System.out.println("validation is starting");
		first();
		lp = new phploginpage();
		hp = new phphomepage();
	}
	
	@AfterMethod
	public void ending() {
		driver.quit();
		System.out.println("validation is over");
		
	}
	
	@Test(priority=2)
	public void test1() {
		
		String title=lp.pagetitle();
		System.out.println("title of the page :"+title);
		
	}
	
	@Test(priority=1)
	public void test2() throws Exception {
		hp = lp.pagelogin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Homepage is displayed successfully");
	}

}
