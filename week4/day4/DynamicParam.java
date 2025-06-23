package week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class DynamicParam extends BaseClass{
	

	  @DataProvider 
	  public String[][] setData() {
		  String[][] data=new String[2][1];
		  data[0][0]="Suryalekha";
		  data[1][0]="Udhai";
		  return data;
	  }
	 
	
	@Test(dataProvider="setData")
	public void dynamSalesForce(String lName) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//Button[text()='View All']")).click();
		
		WebElement legalEle = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act = new Actions(driver);
		act.scrollToElement(legalEle).perform();
		legalEle.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		//details of entity
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']")).sendKeys("SalesForce Automation by"+" "+lName);
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
//		String title = driver.findElement(By.xpath("//slot[@name='primaryField']")).getText();
		String createdMsg = driver.findElement(By.xpath("//div[@class='slds-media__body']")).getText();
		System.out.println(createdMsg);
		if (createdMsg.contains(lName)) {
			System.out.println("Legal entity is created");
		} else {
			System.out.println("Legal entity is not created");
		}
	}
}
