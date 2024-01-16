package basic.Selenium_JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tops_hometestNg {
	  static WebDriver driver;
	  @BeforeClass
      public void openbrowser() {
	     String url = ("https://careercenter.tops-int.com/dashboard");
	     System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
  		 driver = new ChromeDriver();
  		 driver.get(url);
  		 driver.manage().window().maximize();
  		 
      }
	  
	  @Parameters({"mobileNumber","password"})
		 @Test (dataProvider = "dp")
		 public void testlogin(String mobileNumber, String password) throws InterruptedException
		 {
			 WebElement mobileEle = driver.findElement(By.id("mobile"));
			 mobileEle.clear();
			 mobileEle.sendKeys(mobileNumber);
			 
			 WebElement passEle = driver.findElement(By.id("password"));
			 passEle.clear();
			 passEle.sendKeys(password);

			 WebElement btn = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input"));
			 btn.click();
			 
			 WebElement resume = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
			 resume.click();
			 
			 WebElement technicalskill = driver.findElement(By.xpath("//*[@id=\"v-pills-technical-tab\"]"));
			 technicalskill.click();
			 WebElement lan = driver.findElement(By.id("programmingLanguages"));
			 lan.sendKeys("Java,selenium");
			 WebElement database = driver.findElement(By.id("databases"));
			 database.sendKeys("Mysql");
			 WebElement server = driver.findElement(By.id("webServers"));
			 server.sendKeys("Apache");
			 WebElement software = driver.findElement(By.id("softwares"));
			 software.sendKeys("Eclipse,Andoidstudio,GIT");
			 WebElement systems = driver.findElement(By.id("systems"));
			 systems.sendKeys("Windows");
			 WebElement education = driver.findElement(By.xpath("//*[@id=\"v-pills-education-tab\"]"));
			 education.click();
			 Thread.sleep(2000);
		     WebElement add_edu = driver.findElement(By.linkText("+ Add Education Details"));
			 add_edu.click();
			 Thread.sleep(2000);
			 WebElement degree = driver.findElement(By.id("degree"));
			 degree.click();
	         Select degrees = new Select(degree);
	         degrees.selectByValue("3");
	         degree.click();
	         WebElement text = driver.findElement(By.id("collegeName"));
	         text.sendKeys("GTU");
	         WebElement pass_year = driver.findElement(By.id("passingYear"));
	         pass_year.click();
	         Select years = new Select(pass_year);
	         years.selectByValue("2020");
	         pass_year.click();
	         WebElement res = driver.findElement(By.id("result"));
	         res.sendKeys("85");
	         WebElement close = driver.findElement(By.id("//*[@id=\"educationSummery\"]/div/div/div/div[1]/div/button"));
	         close.click();
			 
			 
			 
			 
//			 driver.quit();
		 }
		     @DataProvider(name = "dp")
			 public static Object[][] passdata() {
				 Object o [][] = new Object[1][2];
				 
				 o[0][0] ="7096512011";
				 o[0][1] = "7096512011";
				 
				 return o;
				 
			 }
          
}
