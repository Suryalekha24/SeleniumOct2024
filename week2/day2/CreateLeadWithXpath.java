package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadWithXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
				
		//enter the username
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("democsr");
		//enter the password
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//click on the login 
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@class,'Submit')]"));
		loginBtn.click();
		//click on crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//click on the leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click on the create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
	}

}
