package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to parent frame
		WebElement parentFrame = driver.findElement(By.xpath("//h5[contains(text(), 'Click Me (Inside Nested frame')]/following::iframe"));
		driver.switchTo().frame(parentFrame);
		//switch to child frame
		driver.switchTo().frame("frame2");
		//Click button
		driver.findElement(By.id("Click")).click();
		//switch to default content
		driver.switchTo().defaultContent();
	}

}
