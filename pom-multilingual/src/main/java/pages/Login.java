package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import config.ConfigurationManager;

public class Login extends ProjectSpecificMethod{
	public Login(ChromeDriver driver) {
		this.driver=driver;
	}
	public Login enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(ConfigurationManager.configuration().getusername());	
		return this;
	}
	
	public Login enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(ConfigurationManager.configuration().getpassword());
		return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
