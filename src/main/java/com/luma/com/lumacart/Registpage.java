package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registpage {

	WebDriver driver;
	
	By fstname=By.id("firstname");
	By lstname=By.id("lastname");
	By email=By.name("email");
	By pass=By.id("password");
	By cofmpass=By.name("password_confirmation");
	By click=By.xpath("//button[@class='action submit primary']");
	
	public Registpage(WebDriver d) {
		driver=d;
	}
	
	public void firstname(String name) {
		driver.findElement(fstname).sendKeys(name);
	}
	public void lastname(String name) {
		driver.findElement(lstname).sendKeys(name);
	}
	public void emailid(String name) {
		driver.findElement(email).sendKeys(name);
	}
	public void password(String name) {
		driver.findElement(pass).sendKeys(name);
	}
	public void cofmpassw(String name) {
		driver.findElement(cofmpass).sendKeys(name);
	}
	public void clickon() {
		driver.findElement(click).click();;
	}
	
	
}

