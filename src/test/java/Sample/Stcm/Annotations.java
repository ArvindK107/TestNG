package Sample.Stcm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class Annotations {

	@Test
	private void Facebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Selenium-workspace\\Stcm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	private void Amazon() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\Selenium-workspace\\Stcm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

}
