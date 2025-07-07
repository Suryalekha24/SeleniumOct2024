package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod{
	
	 @Given("Enter the Username as {string}")
	public Login enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);	
		return this;
	}
	@And("Enter the PAssword as {string}")
	public Login enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	@When("Click on the Login Button")
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
