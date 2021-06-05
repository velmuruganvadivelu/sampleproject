package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase_php {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase_php() throws Exception {
		prop = new Properties();
		FileInputStream fp = new FileInputStream("C:\\Users\\acer\\eclipse-workspace-oxygen\\Php-maven\\src\\main\\java\\utils\\phpconfig.properties");
		prop.load(fp);
		
	}
	
	public static void first() {
		String nameofbrowser = prop.getProperty("browser");
		if(nameofbrowser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		}else {
			System.out.println("name of browser is not matched");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}

}
