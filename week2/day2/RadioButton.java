package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Browser
		driver.findElement(By.xpath("(//label[text()='Firefox'])[1]")).click();
		//Selected radio button
//		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/following-sibling::div")).click();
		boolean bSelected = driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/following-sibling::div")).isSelected();
		if (bSelected==true) {
			System.out.println("Radio button is selected");
		} else {
			System.out.println("Radio button not selected");
		}
		//unselect same button
		driver.findElement(By.xpath("//input[@value='Chennai']/parent::div/following-sibling::div")).click();
		//default select radio button
		boolean bOpt1 = driver.findElement(By.xpath("//input[@value='Option1']/parent::div/following-sibling::div")).isSelected();
		boolean bOpt2 = driver.findElement(By.xpath("//input[@value='Option2']/parent::div/following-sibling::div")).isSelected();
		boolean bOpt3 = driver.findElement(By.xpath("//input[@value='Option3']/parent::div/following-sibling::div")).isSelected();
		boolean bOpt4 = driver.findElement(By.xpath("//input[@value='Option4']/parent::div/following-sibling::div")).isSelected();
		
		if (bOpt1) {
			System.out.println("Chrome is selected by default");
		} else if(bOpt2){
			System.out.println("Firefox is selected by default");
		}else if(bOpt3) {
			System.out.println("Safari is selected by default");
		}else if(bOpt4) {
			System.out.println("Edge is selected by default");
		
		}
		//select option if not selected
		boolean bStatus = driver.findElement(By.xpath("//input[@value='21-40 Years']")).isSelected();
		
		if(bStatus){
			System.out.println("Age group 21-40 Years is selected already");
		}
		else {
			driver.findElement(By.xpath("(//input[@value='21-40 Years']/parent::div)/following-sibling::div")).click();
		}
	}
}
