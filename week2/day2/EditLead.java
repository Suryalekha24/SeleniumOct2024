package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
				
		//enter the username
		driver.findElement(By.id("username")).sendKeys("democsr");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on the login 
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on the leads
		driver.findElement(By.linkText("Leads")).click();
		//click on the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
		//first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Suriyaa");
		//Last name
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("U");
		//first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Surya");
		//department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Editing test case");
		//email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suriyaa@testleaf.com");
		//state/province
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selState = new Select(state);
		selState.selectByVisibleText("California");
		//Cretae lead button
		driver.findElement(By.className("smallSubmit")).click();
		//Edit 
		driver.findElement(By.linkText("Edit")).click();
		//Change description field to empty
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("");
		//Important note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edited the Lead");
		//update
		driver.findElement(By.className("smallSubmit")).click();
		
		String ExpTitle="View Lead | opentaps CRM";
		String title = driver.getTitle();
		System.out.println();
		if (title.contains(ExpTitle)) {
			System.out.println("Title matches:"+title);
		} else {
			System.out.println("Title does not match:"+title);
		}
		driver.close();
	}

}
