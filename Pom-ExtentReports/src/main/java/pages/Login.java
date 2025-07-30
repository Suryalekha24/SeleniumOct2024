package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends ProjectSpecificMethod{
	
	 @Given("Enter the Username as {string}")
	public Login enterUserName(String uName) throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(uName);
			reportStep("Username entered successfully","pass");
		} catch (Exception e) {
			reportStep("Username not entered successfully","fail");
		}	
		return this;
	}
	@And("Enter the PAssword as {string}")
	public Login enterPassword(String pwd) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pwd);
			reportStep("password entered successfully","pass");
		} catch (Exception e) {
			reportStep("password not entered successfully","fail");
		}
		return this;
	}
	@When("Click on the Login Button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
