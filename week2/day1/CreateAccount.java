package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		
//		String ExpTitle="Create Account | opentaps CRM";
//		String title = driver.getTitle();
//		System.out.println(title);
		//enter account name
		driver.findElement(By.id("accountName")).sendKeys("Testleaf Auto");
		//enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//enter no.of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("40");
		//enter Site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
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
