package basic.Selenium_JAVA;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class swaglabs_login_junit {

	String username;
	String password;

	public swaglabs_login_junit(String username, String password) {
		super();
		this.username = username;
		this.password = password;

	}

	@Test
	
	public void testlogin() {
		String url = ("https://www.saucedemo.com/");
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement user_name = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		user_name.clear();
		user_name.sendKeys(username);
		WebElement pass_word = driver.findElement(By.id("password"));
		pass_word.clear();
		pass_word.sendKeys(password);
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		btn.click();

	}

	@Parameters
	public static List<Object[]> passData() {
		Object o[][] = new Object[1][2];

		o[0][0] = "standard_user";
		o[0][1] = "secret_sauce";

		return Arrays.asList(o);
	}
}
