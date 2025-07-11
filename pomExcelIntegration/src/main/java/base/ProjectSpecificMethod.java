package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcelIntegration;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	public String fileName;
	
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcelIntegration.readExcel(fileName);
	}
}
