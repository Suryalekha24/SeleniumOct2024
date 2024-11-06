package day5Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//type in searchbox
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Bags for boys");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//Print total result
		String disText1 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[1]")).getText();
		String disText2= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]")).getText();
		System.out.println("Tot result text:"+disText1+" "+disText2);
		//Select first 2 brands
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']//span[text()='Skybags']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']//span[text()='Safari']")).click();
		Thread.sleep(5000);
		//Sort as per New Arrivals
		driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		//Print first displayed bag details
		String bagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
		System.out.println("First bag name from results:"+bagName);
		String bagPrice = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("First bag price from results:"+bagPrice);
		//title of page
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
