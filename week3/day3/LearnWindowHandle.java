package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to get address of current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		//To Click Open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//get all windows
		Set<String> windowHandles = driver.getWindowHandles();
		//convert to list
		List<String> childWindow= new ArrayList <String>(windowHandles);
		//child window
		driver.switchTo().window(childWindow.get(1));
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
//		driver.quit();
	}

}
