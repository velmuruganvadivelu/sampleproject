package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase_php;

public class phphomepage extends Testbase_php  {

	public phphomepage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"logout\"]/a/strong")
	WebElement logout; 
	@FindBy(xpath="//*[@id=\"account\"]/a/i")
	WebElement accountpage;
	
	public String homepagetitle() {
		return driver.getTitle();
	}
	
	public phpaccountpage accountspage() throws Exception {
		accountpage.click();
		return new phpaccountpage();
		
	
	}
	
	public void homeout() {
		logout.click();
	}

}
