package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
				
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on the login 
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on the Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on the create lead
		driver.findElement(By.linkText("Create Account")).click();
		//enter account name
		driver.findElement(By.id("accountName")).sendKeys("Select Accnt");
		//enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//Industry
		WebElement ind = driver.findElement(By.name("industryEnumId"));
		//select class
		Select selInd= new Select(ind);
		selInd.selectByIndex(3);
		//Ownership
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select selOwn = new Select(own);
		selOwn.selectByVisibleText("S-Corporation");
		//Source
		WebElement emp = driver.findElement(By.id("dataSourceId"));
		Select selEmp = new Select(emp);
		selEmp.selectByValue("LEAD_EMPLOYEE");
		//marketing campaign
		WebElement mc = driver.findElement(By.id("marketingCampaignId"));
		Select selMC = new Select(mc);
		selMC.selectByIndex(6);
		//state/province
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selState = new Select(state);
		selState.selectByValue("TX");
		//click Create Account button
		driver.findElement(By.className("smallSubmit")).click();
		String expTitle="Account Details | opentaps CRM";
		String currTitle = driver.getTitle();
		if (expTitle.equals(currTitle)) {
			System.out.println("Title matches: "+currTitle);
		} else {
			System.out.println("Title does not match: "+currTitle);
		}
		
//		driver.close();
	}

}
