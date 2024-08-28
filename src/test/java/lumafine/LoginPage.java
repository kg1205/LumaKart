package lumafine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver d) {
		driver = d;
	}
	By email=By.id("email");
	By passd=By.id("pass");
	By submit=By.name("send");
	
	public void emailid(String name) {
		driver.findElement(email).sendKeys(name);
	}
	public void pass(String name) {
		driver.findElement(passd).sendKeys(name);
	}
	public void submitb() {
		driver.findElement(submit).click();;
	}
}
