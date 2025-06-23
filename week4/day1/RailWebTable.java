package week4.day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RailWebTable {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frmStn = driver.findElement(By.id("txtStationFrom"));
		frmStn.clear();
		Thread.sleep(3000);
		frmStn.sendKeys("MAS");
		frmStn.sendKeys(Keys.ENTER);
			
		WebElement toStn = driver.findElement(By.id("txtStationTo"));
		Thread.sleep(3000);
		toStn.clear();
		toStn.sendKeys("MDU");
		toStn.sendKeys(Keys.ENTER);
		
//		driver.findElement(By.id("buttonFromTo")).click();
		boolean bstatus = driver.findElement(By.id("chkSelectDateOnly")).isSelected();
		if (bstatus) {
			driver.findElement(By.id("chkSelectDateOnly")).click();
		} else {
			System.out.println("Date box already unchecked");
		}
		//table
//		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		int rowSize = rows.size();
//		System.out.println(rowSize);
		
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		for (WebElement eachTrain : trainNames) {
			System.out.println(eachTrain.getText());
		}
		System.out.println("---------------------");
		Set<String> dupTrains= new TreeSet<String>();
		//check this code
		for (int i = 0; i < trainNames.size()-1 ; i++) {
			String allTrains = trainNames.get(i).getText();
			boolean bStatus = dupTrains.add(allTrains);
		
			if (bStatus==false) {
				System.out.println("All train names:"+allTrains);
			}
			else {
				System.out.println("Duplicate trains:"+allTrains);
			}
				
		}
	}

}
