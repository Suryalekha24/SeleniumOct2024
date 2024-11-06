package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelect {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		
		String ExpTitle="Create Lead | opentaps CRM";
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals(ExpTitle)) {
			System.out.println("Title matches.");
		} else {
			System.out.println("Titile does not match");
		}
		
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
//		enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suryalekha");
		//enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("B");
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//create an object for the select class
		Select sel=new Select(sourceDD);
		//select as employee
		sel.selectByIndex(4);
		//click marketing campaign
		WebElement MarCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//create an object for the select class
		Select selMC=new Select(MarCamp);
		//select as Automobile
		selMC.selectByVisibleText("Automobile");
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//create an object for the select class
		Select selOwn=new Select(Ownership);
		//select as Corporation
		selOwn.selectByValue("OWN_CCORP");
//		driver.close();


	}

}
