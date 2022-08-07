package Sample.Stcm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
public static WebDriver driver;
	@BeforeMethod
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Selenium-workspace\\Stcm\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
	}
	@Test(timeOut = 5000)
	private void loginf() throws InterruptedException {
		Thread.sleep(3000);
WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
email.sendKeys("8056010941");

WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
pass.sendKeys("arvmar2972017.");

WebElement click = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
click.click();
	}
	
	@AfterMethod
	private void close() throws InterruptedException {
String title = driver.getTitle();
System.out.println(title);
	}
	
	
	
	
	
	
	
	
	
	
}
