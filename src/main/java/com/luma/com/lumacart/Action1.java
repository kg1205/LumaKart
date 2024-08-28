package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	WebDriver driver;

	public Action1(WebDriver d) {
		driver = d;

	}

	By clickonER = By.linkText("Emergency Registration");
	By frstname = By.name("PNT_NAME");

	public void actionclass() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(clickonER)).click().build().perform();
		
	}
	public void action1class(String name) {
		driver.findElement(frstname).sendKeys(name);
	}
}
