package basic.Selenium_JAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tops_home {
	public static void main(String[] args) throws InterruptedException {
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

   		WebElement btn1 = driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span"));
   		btn1.click();
   		WebElement btn2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[3]/a"));
   		btn2.click();
   		
   		Thread.sleep(2000);
   		WebElement btn3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
   		btn3.click();
   		WebElement btn4 = driver.findElement(By.xpath("//*[@id=\"v-pills-technical-tab\"]"));
   		btn4.click();
   		Thread.sleep(2000);
   		WebElement btn5 = driver.findElement(By.id("programmingLanguages"));
   		btn5.sendKeys("java,python,database");
   		WebElement btn6 =driver.findElement(By.id("databases"));
   		btn6.sendKeys("Mysql");
   		WebElement btn7 =driver.findElement(By.id("webServers"));
   		btn7.sendKeys("Apache");
   		WebElement btn8 = driver.findElement(By.id("softwares"));
   		btn8.sendKeys("Git");
   		WebElement btn9 = driver.findElement(By.id("systems"));
   		btn9.sendKeys("windows");
   		Thread.sleep(2000);
   		WebElement education = driver.findElement(By.xpath("//*[@id=\"v-pills-education-tab\"]"));
   		education.click();
//   	WebElement edit = driver.findElement(By.xpath("//*[@id=\"v-pills-education\"]/div/div[2]/div[2]/div/a[1]/i"));
//   	edit.click();
   		Thread.sleep(2000);
   		WebElement addedu = driver.findElement(By.xpath("//*[@id=\"v-pills-education\"]/div/div[5]/a"));
   		addedu.click();
   		Thread.sleep(2000);
   		WebElement degree = driver.findElement(By.name("degree"));
   		degree.click();
   		Select dgrees = new Select(degree);
   		dgrees.selectByValue("3");
   		degree.click();
   		WebElement text = driver.findElement(By.id("collegeName"));
   		text.sendKeys("Gtu");
   		WebElement year = driver.findElement(By.id("passingYear"));
   		year.click();
   		Select years = new Select(year);
   		years.selectByValue("2020");
   		year.click();
   		WebElement result = driver.findElement(By.id("result"));
   		result.sendKeys("85");
   		WebElement close = driver.findElement(By.xpath("//*[@id=\"educationSummery\"]/div/div/div/div[1]/div/button"));
   		close.click();
  // 	Thread.sleep(2000);
   		
   		WebElement upload = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[4]/a"));
   		upload.click();
   		driver.findElement(By.id("reviewImage")).sendKeys("C:\\Users\\Hello\\Pictures\\ss\\err.png");
   		WebElement review = driver.findElement(By.id("reviewForm"));
   		review.click();
   		Select reviews = new Select(review);
   		reviews.selectByValue("google");
   		review.click();
   		WebElement remark = driver.findElement(By.id("sugText"));
   		remark.sendKeys("Thank you");
   		
   		WebElement event = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/li[7]/a"));
   		event.click();
   		WebElement left_arrow = driver.findElement(By.xpath("//*[@id=\"events-slider\"]/div[2]/button[1]/div"));
   		left_arrow.click();
   		WebElement right_arrow = driver.findElement(By.xpath("//*[@id=\"events-slider\"]/div[2]/button[2]/div"));
   		right_arrow.click();
   		
   		
   		
   		
   		
   		
   	//	driver.quit();
   		
	}
}
