package week4.day1;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		//row
		List<WebElement> rowCnt = table.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr"));
		int size = rowCnt.size();
		System.out.println(size);
		//another method
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size2 = rows.size();
		System.out.println(size2);
		//Column count
		List<WebElement> colCnt = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		int colSize = colCnt.size();
		System.out.println(colSize);
		//retrieve particular data
		String text = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td[3]")).getText();
		System.out.println(text);
		//entire row data
		List<WebElement> singleRow = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td"));
//		all data
		for (WebElement rowIter : singleRow) {
			System.out.println(rowIter.getText());
		}
		//data from column
		List<WebElement> singleCol = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[3]"));
		for (WebElement colIter : singleCol) {
			System.out.println(colIter.getText());
		}
		System.out.println("---------");
/*		//print all data from all rows and column
		List<WebElement> allData = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
		for (WebElement entireData : allData) {
			System.out.println(entireData.getText());
		}*/
		
		//dynamic changing data
		for (int i = 0; i < rows.size(); i++) {
			WebElement element = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for (int j = 0; j < colSize; j++) {
				WebElement datas = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td["+j+"]"));
				System.out.println(datas.getText());
			}
		}
		}

}
