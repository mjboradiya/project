package basic.Selenium_JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TopsLogin_Testing {
	
	 static WebDriver driver;
	 @BeforeClass
	 public static void openBrowser()
	 {
	String url = ("https://careercenter.tops-int.com/");
	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get(url);
	 driver.manage().window().maximize();
}
	 @Parameters({"mobileNumber","password"})
	 @Test (dataProvider = "dp")
	 public void testlogin(String mobileNumber, String password)
	 {
		 WebElement mobileEle = driver.findElement(By.id("mobile"));
		 mobileEle.clear();
		 mobileEle.sendKeys(mobileNumber);
		 
		 WebElement passEle = driver.findElement(By.id("password"));
		 passEle.clear();
		 passEle.sendKeys(password);

		 WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
		 btn.click();
	 }
	     @DataProvider(name = "dp")
		 public static Object[][] passdata() {
			 Object o [][] = new Object[1][2];
			 
			 o[0][0] ="7096512011";
			 o[0][1] = "7096512011";
			 
			 return o;
		 }
	 
	
}
