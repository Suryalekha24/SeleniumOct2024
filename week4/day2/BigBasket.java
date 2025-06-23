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

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Shop by category
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Thread.sleep(3000);
		
		//Foodgrains, Oil & Masala->Rice->Boiled Rice
		Actions act= new Actions(driver);
		WebElement fMele = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.moveToElement(fMele).perform();
		Thread.sleep(2000);
		WebElement rCele = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(rCele).perform();
		Thread.sleep(2000);
		WebElement bRele = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		act.moveToElement(bRele).perform();
		bRele.click();
		Thread.sleep(3000);
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,140)");
		 
		//bbRoyal brand
		WebElement brandEle = driver.findElement(By.xpath("//input[@id='i-BBRoyal' and @type='checkbox']"));
		act.moveToElement(brandEle).click().perform();
		Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,140)");
		//Tamil Ponni rice
		WebElement ponniEle = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"));
		act.moveToElement(ponniEle).click().perform();
		Thread.sleep(3000);
		
		Set<String> wHandles = driver.getWindowHandles();
		List<String> childWindow= new ArrayList <String>(wHandles);
		driver.switchTo().window(childWindow.get(1));
		//5kg rice
		WebElement fiveEle = driver.findElement(By.xpath("(//div[@class='flex flex-col items-end relative flex-1 h-full'])[5]"));
		act.scrollToElement(fiveEle).click().perform();
		//driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='mask' and @id='TickIcon_svg__a']")).click();
		String royalRPrice = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 PackSizeSelector___StyledLabel5-sc-l9rhbt-5 gJxZPQ bvikaK'])[5]")).getText();
		System.out.println(royalRPrice);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(3000);
		String cartMsg = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		System.out.println(cartMsg);
		//screenshot of the page
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/cartPage.png");
		FileUtils.copyFile(source, destination);
		driver.close();
		driver.switchTo().window(childWindow.get(0)).close();
	}

}
