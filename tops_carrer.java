package basic.Selenium_JAVA;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tops_carrer {
     public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.get("https://careercenter.tops-int.com/");
   		driver.manage().window().maximize();
   		WebElement Mobile  = driver.findElement(By.id("mobile"));
   		Mobile.sendKeys("7096512011");
   		WebElement Password = driver.findElement(By.id("password"));
   		Password.sendKeys("7096512011");
   		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
   		login.click();
   		
   		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]"));
   		btn1.click();
   		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[1]/a"));
   		btn2.click();
   		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//   		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//   		
//   		WebElement ele =driver.findElement(By.xpath("//*[@id=\"select2-district-container\"]/span"));
//   		Actions action = new Actions(driver);
//   		
//   		action.click(ele)
//   		     .sendKeys("Rajkot")
//             .pause(Duration.ofSeconds(5))
//   		     .sendKeys(Keys.ARROW_DOWN)
//   		     .sendKeys(Keys.ENTER)
//   		     .build()
//   		     .perform();
   		
   		WebElement image = driver.findElement(By.xpath("//*[@id=\"profileImage\"]"));
   		image.click();
   		image.sendKeys("C:\\Users\\Hello\\Pictures\\ss\\err.png");
   		
   		
   		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]"));
   		btn3.click();
   		WebElement logout = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a"));
   		logout.click();   		
   		
	}
}
