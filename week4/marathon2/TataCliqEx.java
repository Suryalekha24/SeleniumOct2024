package week4.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliqEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.tatacliq.com/");
		WebElement dispBox = driver.findElement(By.xpath("//button[text()='Ask Me Later']"));
		boolean displayed = dispBox.isDisplayed();
		if (displayed) {
			dispBox.click();
		}
		//Brands
		WebElement brandEle = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act =new Actions(driver);
		act.moveToElement(brandEle).perform();
		//Watches and Accessories
		WebElement hovEle = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(hovEle).perform();
		//casio
		WebElement casioEle = driver.findElement(By.xpath("//div[text()='Casio']"));
		casioEle.click();
		WebElement selDD = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select sel=new Select(selDD);
		sel.selectByVisibleText("New Arrivals");
		Thread.sleep(3000);
		//Men button
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		Thread.sleep(7000);
		//Print all prices
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		List<String>priceList=new ArrayList<String>();
		for (WebElement eachPrice : prices) {
			String pText = eachPrice.getText();
			priceList.add(pText);
		}
		System.out.println("Prices of first page items:"+priceList);
		
		System.out.println("----------------------------");
		//price of first watch
		String firstWPrice = priceList.get(0);
		System.out.println("Price of first watch displayed:"+firstWPrice);
		Thread.sleep(5000);
		//click on first watch
		
		 WebElement watEle = driver.findElement(By.xpath(
		  "//div[@class='ProductModule__imageAndDescriptionWrapper']")); 
		 /* WebElement firstWatEle = watEle.get(0); firstWatEle.click();
		 */
		 act.click(watEle).perform();
		//switch to new tab
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wList= new ArrayList <String>(windowHandles);
		//child window
		driver.switchTo().window(wList.get(1));
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		//get count of cart
		WebElement cartBag = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String cartCnt = cartBag.getText();
		System.out.println("Items count in cart : " +cartCnt);
		
		//compare
		String cartPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']")).getText();
		if (cartPrice.contains(firstWPrice)) {
			System.out.println("Price matches in both");
		} else {
			System.out.println("Prices dont match");
		}
		//click on cart icon
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		//take screenshot
		TakesScreenshot ss=(TakesScreenshot)driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\surya\\SeleniumProject\\src\\main\\java\\week4\\marathon2\\ScreenShot.png"));
		driver.close();
		driver.switchTo().window(wList.get(0));
		driver.close();
	}

}
