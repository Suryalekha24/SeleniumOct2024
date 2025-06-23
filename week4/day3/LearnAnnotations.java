package week4.day3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	 @Test
	  public void testcase() {
		  System.out.println("testcase1");
	  }
	  @Test
	  public void testcase2() {
		  System.out.println("testcase2");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("aftermethod");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("aftersuite");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforemethod");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforetest");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");
	  }
}
