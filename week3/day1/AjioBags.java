package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBags {

	public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement element = driver.findElement(By.name("searchVal"));
			element.sendKeys("Bags");
			element.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//label[contains(@class,'Men')])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//label[contains(@class,'Men')])[4]")).click();
			Thread.sleep(3000);
			//count of total items
			String totItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
			System.out.println("Count of items: "+totItems);
			//brand names list
			List<WebElement> brandsLst = driver.findElements(By.xpath("//div[@class='brand']"));
			for (WebElement brandName : brandsLst) {
				System.out.println("Brand names:"+brandName.getText());
			}
			System.out.println("----------------------------------------");
			//bags name displayed
			List<WebElement> bagLst = driver.findElements(By.xpath("//div[@class='nameCls']"));
			for (WebElement bagName : bagLst) {
				System.out.println(bagName.getText());
			}
			
			driver.close();
	}

}