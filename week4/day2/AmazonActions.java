package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("oneplus 9 pro");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		//First Product Price
		List<WebElement> totItems = driver.findElements(By.xpath("//span[@class='a-price']"));
		String firstPrice = totItems.get(0).getText();
		System.out.println("First Product Price:"+firstPrice);
		
		//first product rating
		List<WebElement> allRatings = driver.findElements(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String firstRating = allRatings.get(0).getText();
		System.out.println("First Product rating:"+firstRating);
		
		//First text link of first image
		String text = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).getText();
		System.out.println(text);
		
		//click first product
		WebElement firstEle = driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//a"));
		firstEle.click();
		
		//Screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/AmzProduct.png");
		FileUtils.copyFile(source, destination);
		
		//Add to Cart
		Set<String> wHandles = driver.getWindowHandles();
		List<String> childWindow= new ArrayList <String>(wHandles);
		driver.switchTo().window(childWindow.get(1));
		
		WebElement cartEle = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]"));

		Actions act=new Actions(driver);
		act.scrollToElement(cartEle).click().perform();		
			//scroll down
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			 js.executeScript("window.scrollBy(0,150)");
						
		Thread.sleep(4000);
		
		//Get cart subtotal
		String cartTot = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart sub total:"+cartTot);
		
		String[] split = cartTot.split(".");
		if (split[1].equals(firstPrice)) {
			System.out.println("Cart sub total verified.Matches first Product price:"+split[1]);
		}
		else {
			System.out.println("Cart total does not match price.");
		}
//		driver.close();
	}

}
