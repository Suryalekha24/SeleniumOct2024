package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod{
	
	 @Given("Enter the Username as {string}")
	public Login enterUserName(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);	
		return this;
	}
	@And("Enter the PAssword as {string}")
	public Login enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	@When("Click on the Login Button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
