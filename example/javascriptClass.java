package example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptClass {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		js.executeScript("document.getElementByID('element id ').click();");

	}

}
