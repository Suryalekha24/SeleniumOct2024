package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement scrollEle = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions act =new Actions(driver);
		act.scrollToElement(scrollEle).perform();
		String text = scrollEle.getText();
		System.out.println(text);
		driver.close();
	}

}
