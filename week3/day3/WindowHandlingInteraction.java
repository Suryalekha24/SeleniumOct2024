package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

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
		//Click Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//Merge Contacts
		driver.findElement(By.partialLinkText("Merge")).click();
		//FRom widget
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
		//Get window handles
		Set<String> wHandle1 = driver.getWindowHandles();		
		List<String> fromWindow= new ArrayList <String>(wHandle1);
		//switch to child window
		driver.switchTo().window(fromWindow.get(1));
		//First resulting contact in list
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]//a)[1]")).click();
		driver.switchTo().window(fromWindow.get(0));
		//To widget
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		Set<String> wHandle2 = driver.getWindowHandles();		
		List<String> toWindow= new ArrayList <String>(wHandle2);
		//switch to child window
		driver.switchTo().window(toWindow.get(1));
		//Second resulting contact in list
		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[2]//a)[1]")).click();
		driver.switchTo().window(toWindow.get(0));
		driver.findElement(By.linkText("Merge")).click();
		//Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//title of page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Merge Contacts | opentaps CRM"))
		{
			System.out.println(title+" Title verified successfully");
		}
		else {
			System.out.println(title + " Title is not verified");
		}
	}

}
