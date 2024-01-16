package basic.Selenium_JAVA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        driver.get("https://www.facebook.com/");
         String title = driver.getTitle();
         System.out.println(title);
          String url = driver.getCurrentUrl();
          System.out.println(url);
          driver.close();
          driver.quit();
    }
}
