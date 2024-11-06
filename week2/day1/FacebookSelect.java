package week2.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		//create an account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf2410@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("surya_testleaf24");
		//DOB
		WebElement dayElmnt = driver.findElement(By.id("day"));
		Select selDay = new Select(dayElmnt);
		selDay.selectByIndex(5);
		WebElement monElmnt = driver.findElement(By.id("month"));
		Select selMon = new Select(monElmnt);
		selMon.selectByVisibleText("May");
		WebElement yrElmnt = driver.findElement(By.id("year"));
		Select selYear = new Select(yrElmnt);
		selYear.selectByValue("1990");
		//Gender
		WebElement genElmnt = driver.findElement(By.xpath("//input[@value='1']"));
		genElmnt.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
