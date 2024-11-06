package day5Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookCinema {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.className("cinemas-inactive")).click();
		Thread.sleep(5000);
		WebElement Cinema= driver.findElement(By.id("cinema"));
		Cinema.click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX National,Virugambakkam Chennai')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[2]")).click();
		Thread.sleep(3000);
		//Clcik book
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(5000);
		//Accept popup
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(5000);
		//book seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:9']")).click();
		Thread.sleep(5000);
		//print seat info
		String text = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Print the seat info:"+text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
		//Print Grand Total
		String gtText = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(gtText);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//Title of Page
		String title = driver.getTitle();
		System.out.println("Title of screen:"+title);
		driver.close();
		
	
	}

}
