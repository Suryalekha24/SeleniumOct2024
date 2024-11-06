package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Get Display text
		String noteText = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String msg="Checked";
		if (noteText.contains(msg)) {
			System.out.println("Message displayed correctly");
		} else {
			System.out.println("Message displayed incorrectly");
		}
		Thread.sleep(3000);
		//Language checkbox
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(5000);
		//Tri-state
		driver.findElement(By.xpath("//div[contains(@id,'ajaxTriState')]")).click();
		
		String stateMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(stateMsg);
		Thread.sleep(3000);
		if (stateMsg.contains("State has been changed.")) {
			System.out.println("State changed message displayed");
		} else {
			System.out.println("State changed message not displayed");
		}
		Thread.sleep(3000);
		//toggle
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String toggText = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String toggleMsg="Checked";
		if (toggText.contains(toggleMsg)) {
			System.out.println("Message displayed correctly");
		} else {
			System.out.println("Message displayed incorrectly");
		}
		boolean bStatus = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		System.out.println(bStatus);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		driver.close();
		}

}
