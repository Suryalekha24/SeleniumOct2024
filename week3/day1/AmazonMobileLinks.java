package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobileLinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Mobiles");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size = allLinks.size();
		System.out.println("Total Links:"+size);
		
		List<WebElement> priceLinks = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int psize = priceLinks.size();
		System.out.println("Price Links:"+psize);
		
		//New list for adding price links
		//List <String> allPrices= new ArrayList<String> ();
		
		List <Integer> list = new ArrayList<Integer>();
		for (WebElement each : priceLinks) {
			String text = each.getText();
//			allPrices.add(text);
			String replaceAll = text.replaceAll(",", "");
			int parseInt = Integer.parseInt(replaceAll);
			list.add(parseInt);
			Collections.sort(list);
		}
		
		System.out.println(list);
//		System.out.println(allPrices);
//		driver.close();
	}

}
