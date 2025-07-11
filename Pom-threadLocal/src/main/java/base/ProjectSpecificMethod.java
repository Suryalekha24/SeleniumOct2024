package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcelIntegration;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	
	public String fileName;
	private static final ThreadLocal <ChromeDriver> cDriver= new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	
	@BeforeMethod
	public void preCondition() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadExcelIntegration.readExcel(fileName);
	}
}
