package week4.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Men's->Sports shoes
		WebElement menEle = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		Actions act= new Actions(driver);
		act.moveToElement(menEle).perform();
		WebElement sShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		act.moveToElement(sShoes).perform();
		sShoes.click();
		//get count of sports shoes
		String cntSshoes = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println("Count of Sport shoes:"+cntSshoes);
		//Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);
		//sort by price low to high
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-index='1']")).click();
		Thread.sleep(3000);
		//range
		WebElement fromEle = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromEle.clear();
		fromEle.sendKeys("500");
		WebElement toEle = driver.findElement(By.xpath("//input[@name='toVal']"));
		toEle.clear();
		toEle.sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
		//choose color
		//WebElement colorEle = driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']/input[@type='checkbox' and @value='White%20%26%20Blue']"));
		WebElement colorEle = driver.findElement(By.xpath("//a[contains(text(),'White & Blue')]"));
		act.click(colorEle).perform();
		Actions builder= new Actions(driver);
		//mouse over first product
		WebElement firstProd = driver.findElement(By.xpath("//p[@class='product-title']"));
//		WebElement firstProd = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		builder.moveToElement(firstProd).perform();
		Thread.sleep(2000);
		//Quick view
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(2000);
		String amount = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Rs." + amount);
		String discountPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discountPercentage);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoes.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.xpath("//div[contains(@class,'close')]")).click();
		driver.close();
	}

}
