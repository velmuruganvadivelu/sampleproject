package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase_php;

public class phploginpage extends Testbase_php {

	public phploginpage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label/input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='remember']")
	WebElement checkbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Login')]")
	WebElement submit;
	
	public String pagetitle() {
		return driver.getTitle();
	}
	
	public phphomepage pagelogin(String uname,String pass) throws Exception {
		username.sendKeys(uname);
		password.sendKeys(pass);
		checkbox.click();
		submit.click();
		
		return new phphomepage();
	}

}
