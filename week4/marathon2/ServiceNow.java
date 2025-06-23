package week4.marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://dev186929.service-now.com/");
		//login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow sd = new Shadow(driver);
		sd.setImplicitWait(30);
		//Service Catalog
		sd.findElementByXPath("//div[text()='All']").click();
		sd.findElementByXPath("//span[text()='Service Catalog']").click();
		//Click on Mobiles
		
	}

}
