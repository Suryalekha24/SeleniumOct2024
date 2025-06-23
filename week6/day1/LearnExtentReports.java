package week6.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {
	
	public static void main(String[] args) throws IOException {
		
		//setup report path
		ExtentHtmlReporter report= new ExtentHtmlReporter("./reports/results.html");
		report.setAppendExisting(true);
		
		//create a class
		ExtentReports extent=new ExtentReports();
		
		//attach data with file
		extent.attachReporter(report);
		
		
		//create a testcase and assign details
		ExtentTest test = extent.createTest("createLead","details");
		
		//assign a category
		test.assignCategory("smoke");
		test.assignAuthor("Surya");
		
		//attach testLevel status(screenshot)
		test.pass("Login is successful",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/homepage.png").build());
		test.pass("Lead created successfully");
		
		
		//mandatory step
		extent.flush(); //reports will be saved in reports folder
		System.out.println("Completed");
	}
}
