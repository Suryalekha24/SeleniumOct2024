package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Login;

public class RunLogin extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setValues() {
		fileName="Login";
	}
	
	@Test(dataProvider="sendData")
	public void runLogin(String uName,String pwd) {
//		System.out.println("from Run Login"+driver);
		
		Login lp=new Login();
		lp.enterUserName(uName).enterPassword(pwd).clickLogin();
	}

}
