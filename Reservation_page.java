package basic.Selenium_JAVA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reservation_page {
	  static WebDriver driver;
	  @BeforeClass
      public void openbrowser() {
    	  String url = ("https://demo.guru99.com/test/newtours/reservation.php");
 	     System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
   		 driver = new ChromeDriver();
   		 driver.get(url);
   		 driver.manage().window().maximize();
      }
	  
	  @Test
	  public void testlogin() {
		  List<WebElement> trip1 = driver.findElements(By.name("tripType"));
		  trip1.get(1).click();
		  
		  WebElement passenger = driver.findElement(By.name("passCount"));
		  Select passengers = new Select(passenger);
		  passengers.selectByValue("3");
		  
		  WebElement department = driver.findElement(By.name("fromPort"));
		  Select departments = new Select(department);
		  departments.selectByValue("New York");
		  
		  WebElement month = driver.findElement(By.name("fromMonth"));
		  Select months = new Select(month);
		  months.selectByValue("3");
		  
		  WebElement day = driver.findElement(By.name("fromDay"));
		  Select days = new Select(day);
		  days.selectByValue("11");
		  
		  WebElement arriving = driver.findElement(By.name("toPort"));
		  Select arrivings = new Select(arriving);
		  arrivings.selectByValue("Paris");
		  
		  WebElement Tomonth = driver.findElement(By.name("toMonth"));
		  Select Tomonths = new Select(Tomonth);
		  Tomonths.selectByValue("5");
		  
		  WebElement Today = driver.findElement(By.name("toDay"));
		  Select Todays = new Select(Today);
		  Todays.selectByValue("6");
		  
		  List<WebElement> radio = driver.findElements(By.name("servClass"));
		  radio.get(2).click();
		  
		  WebElement airline = driver.findElement(By.name("airline"));
		  Select airlines = new Select(airline);
		  airlines.selectByVisibleText("Unified Airlines");
		  
		  WebElement submit = driver.findElement(By.name("findFlights"));
		  submit.click();
	  }
	  
	  
	  @AfterClass
	  public void quit() {
		driver.quit();
	  }
}
