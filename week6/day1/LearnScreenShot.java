package week6.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//take screenshot
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		//locate the page
		File destination=new File("./snaps/homepage.png");
		//connection between source and destination
		FileUtils.copyFile(source, destination);
		
		//particular text field
		WebElement textfield = driver.findElement(By.id("username"));
		
		File source1 = textfield.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snaps/textfield.png");
		FileUtils.copyFile(source1, destination1);

	}

}
