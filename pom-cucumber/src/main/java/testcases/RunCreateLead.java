package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class RunCreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setValues() {
		fileName="createLead";
	}
	
	@Test(dataProvider="sendData")
	public void runCL(String uName,String pwd,String cName,String fName,String lName) {
		System.out.println("From Create LEad"+driver);
		Login lp = new Login(driver);
	
		lp.enterUserName(uName).enterPassword(pwd).clickLogin().clickCrmsfa().clickLeadLink().clickCreateLead().enterCompName(cName).
		enterFirstName(fName).enterLastName(lName).clickSubmit();
		
		}
}
