package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SFDefinition extends BaseClass{
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).submit();
	}

	@Then("Click on Toggle button")
	public void click_on_toggle_button() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@And("cick on View All button")
	public void cick_on_view_all_button() {
		driver.findElement(By.xpath("//Button[text()='View All']")).click();
	}

	@And("Click on Sales in App Launcher")
	public void click_on_sales_in_app_launcher() {
		WebElement salesEle = driver.findElement(By.xpath("//p[text()='Sales']"));
		Actions act=new Actions(driver);
		act.scrollToElement(salesEle).perform();
		salesEle.click();
	}

	@And("click on Accounts tab")
	public void click_on_accounts_tab() {
		WebElement accountsTab = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()",accountsTab);
	}

	@And("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@And("Enter name as {string}")
	public void enter_name_as(String mName) {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys(mName);
	}

	@And("Select Ownership as Public")
	public void select_ownership_as() {
		JavascriptExecutor js = driver;
		WebElement comboEle = driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		js.executeScript("arguments[0].click();", comboEle);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@Then("Click Save button")
	public void click_save_button() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Verify Account name has been created")
	public void verify_account_name_has_been_created() {
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
		if (text.equalsIgnoreCase("Suryalekha")) {
			System.out.println("Account created successfully: "+text);
		} else {
			System.out.println("Account not created");
		}
	}
}
