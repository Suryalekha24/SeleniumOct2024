package week5Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testng.ReadExcelIntegration;

public class BaseClass {
	public RemoteWebDriver driver;
	public String excelFileName;
	
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcelInteg.readExcelNew(excelFileName);
	}
		
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String uName,String pwd) {
				
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	 }
	 
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	 @AfterSuite
	 public void stopReport() {
		 System.out.println("Stop Report");
	 }
}
