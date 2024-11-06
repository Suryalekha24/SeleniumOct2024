package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//Find Lead
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		//Phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("123");
		//Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		//click on first ID
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		//click Delete
		driver.findElement(By.linkText("Delete")).click();
		//Find Leads again
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		//LeadID
		driver.findElement(By.name("id")).sendKeys(text);
		//Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String delRec = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		String expMsg="No records to display";
		if (delRec.contains(expMsg)) {
			System.out.println("Deletion successful");
		} else {
			System.out.println("Deletion did not occur");
		}
//		driver.close();

	}

}
