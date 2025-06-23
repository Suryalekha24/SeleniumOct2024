package week4.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StaticParam extends BaseClass{

	@Test
	public void SalesforceLegalEntity() throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//Button[text()='View All']")).click();
		
		WebElement legalEle = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act = new Actions(driver);
		act.scrollToElement(legalEle).perform();
		legalEle.click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//*[@data-key='chevrondown'])[7]")).click();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		/*
		 * WebElement newEntity =
		 * driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		 * act.scrollToElement(newEntity).perform(); newEntity.click();
		 */
		//details for Legal entity
//		driver.findElement(By.name("Name")).sendKeys("LegalSales1");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//*[@class='slds-textarea'])[2]")).sendKeys("SalesForces");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)");
		WebElement comboEle = driver.findElement(By.xpath("//span[text()='--None--']"));
		js.executeScript("arguments[0].click();", comboEle);
//		WebElement comboEle = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox_')]/following-sibling::div/lightning-icon"));
//		act.moveToElement(comboEle).keyDown(Keys.ENTER).perform();
//		comboEle.click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//save
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		String text = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
		System.out.println(text);
		if (text.contains("Legal Entity Name")) {
			System.out.println("Error message for name displayed");
		} else {
			System.out.println("Error message for name not displayed");
		}
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		driver.close();
	}
}
