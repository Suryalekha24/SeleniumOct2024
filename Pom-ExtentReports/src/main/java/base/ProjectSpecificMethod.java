package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcelIntegration;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	
	public String fileName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName,testCategory,testAuthor,testDescription;
	
	@BeforeSuite
	public void startReports() {
		ExtentHtmlReporter report= new ExtentHtmlReporter("./reports/results.html");
		report.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(report);
	}
	
	private static final ThreadLocal <ChromeDriver> cDriver= new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	
	
	@BeforeClass
	public void testcaseDetails() {
		test=extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	@Parameters("browser")
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
	
	@AfterSuite
	public void stopReports() {
		extent.flush();
	}
	
	public void reportStep(String msg,String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		} else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}
	}
	
	public int takeSnap() throws IOException {
		int random=(int)(Math.random()*999999+999999);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File dest= new File("./snaps/img"+random+".png");
		FileUtils.copyFile(src, dest);
		return random;
	}
	
}
