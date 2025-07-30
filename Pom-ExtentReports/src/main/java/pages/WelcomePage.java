package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethod {
	@When("click on crmsfa link")
	public MyHome clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
	}
}
