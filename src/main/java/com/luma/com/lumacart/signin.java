package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signin {

	WebDriver driver;
	
	By sign=By.linkText("Sign In");
	By emailid=By.id("email");
	By pass=By.id("pass");
	By click=By.name("send");
	
	public  signin(WebDriver d) {
		driver=d;
	}
	
	public void signinpage() {
		driver.findElement(sign).click();
	}
	public void email(String name) {
		driver.findElement(emailid).sendKeys(name);
	}
	public void password(String name) {
		driver.findElement(pass).sendKeys(name);
	}
	public void clickon() {
		driver.findElement(click).click();
	}
}
