package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class LoginTest {
	
public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp()
	{
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bfmnyameni@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ghsdhh");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
