package week2.day2;

import org.openqa.selenium.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle="Dashboard";
		if(title.equals(expTitle)) {
			System.out.println("Title matches");
		}else {
			System.out.println("Title not matched");
		}
		driver.navigate().back();
		boolean status = driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		System.out.println(status);
		WebElement eSubBtn = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point location = eSubBtn.getLocation();
		System.out.println(location);
		WebElement eSaveBtn = driver.findElement(By.xpath("//span[text()='Save']"));
		String cssValue = eSaveBtn.getCssValue("background-color");
		System.out.println(cssValue);
		WebElement eleBtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension size = eleBtn.getSize();
		System.out.println(size);
		driver.close();
	}

}
