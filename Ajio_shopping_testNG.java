package basic.Selenium_JAVA;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Ajio_shopping_testNG {
         static WebDriver driver;
         @BeforeClass
	public void openBroswer() {
		     String url = ("https://www.ajio.com/?gclid=EAIaIQobChMIrsWZyvfJgAMVG7pLBR2ANgZREAAYASAAEgKW5fD_BwE");
	 	     System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
	   		 driver = new ChromeDriver();
	   		 driver.get(url);
	   		 driver.manage().window().maximize();
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}
}
