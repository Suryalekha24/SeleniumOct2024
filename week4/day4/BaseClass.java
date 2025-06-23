package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
		
	public ChromeDriver driver;
		
	@Parameters({"url","username","password"})
		@BeforeMethod
		public void preConditions(String url,String uName,String pwd) {
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifications");
			 	driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.id("username")).sendKeys(uName);
				driver.findElement(By.id("password")).sendKeys(pwd);
				driver.findElement(By.id("Login")).submit();
	}
	

		@AfterMethod
		public void postConditions() {
				//driver.close();
		}
}
