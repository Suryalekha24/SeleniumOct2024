package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com ");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String currenttitle = driver.getTitle();
		
		if (currenttitle.equals(title)) {
			System.out.println("We are in same page");
		} else {
			System.out.println("We have navigated to new page");
		}
		driver.close();
	}
}
