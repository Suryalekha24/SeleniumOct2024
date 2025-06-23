package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicit {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		//wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1));
		WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Open with delay']")));
		clickable.click();
		
		Boolean bStat = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(bStat);
		
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); //convert to list
		 * List<String> childWindow= new ArrayList <String>(windowHandles);
		 * 
		 * for (int i = 0; i < childWindow.size()-1; i++) {
		 * driver.switchTo().window(childWindow.get(i)); String windowHandle =
		 * driver.getWindowHandle(); // System.out.println(windowHandle);
		 * System.out.println(driver.getTitle()); driver.close();
		 * 
		 * }
		 */
	}

}
