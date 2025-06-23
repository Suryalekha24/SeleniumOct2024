package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,80)");
		driver.findElement(By.xpath("//span[text()='More']")).click();
		Actions act= new Actions(driver);
		WebElement cryptEle = driver.findElement(By.xpath("(//a[contains(text(),'Crypto')])[3]"));
		act.moveToElement(cryptEle).click().perform();
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'markets-table')]"));
		List<WebElement> rowCnt = table.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr"));
		int size = rowCnt.size();
		System.out.println(size);
		//names of cryptoCurr
		List<WebElement> singleCol = driver.findElements(By.xpath("//table[contains(@class,'markets-table')]/tbody/tr/td[2]"));
		for (WebElement colIter : singleCol) {
			System.out.println(colIter.getText());
		}
		driver.close();
	}

}
