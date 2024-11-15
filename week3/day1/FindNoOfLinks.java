package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find th no of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size = allLinks.size();
		System.out.println(size);
		WebElement name = allLinks.get(1);
		String text = name.getText();
		System.out.println(text);
		List <String> list = new ArrayList<String>();
		
		for (WebElement each : allLinks) {
			String text2 = each.getText();
//			System.out.println(text2);
			list.add(text2);
		}
		System.out.println(list);
//		driver.close();
	}

}
