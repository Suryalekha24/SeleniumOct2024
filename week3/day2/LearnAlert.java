package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//Confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.accept();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		//Prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Surya");
		alert.dismiss();
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}
}
