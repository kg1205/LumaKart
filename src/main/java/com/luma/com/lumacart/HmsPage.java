package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HmsPage {

	WebDriver driver;
	
	public HmsPage(WebDriver d) {
		driver=d;
	}
	
	By hmsclick=By.partialLinkText("HMS");
	By userbox=By.name("username");
	By passbox=By.name("password");
	By submitclick=By.xpath("/html/body/div[2]/div/form/input[3]");
	
	
	public void clickonhms(){
		driver.findElement(hmsclick).click();
	}
	public void loginpage(String name) {
		driver.findElement(userbox).sendKeys(name);
		
	}
	public void loginpass(String name) {
		driver.findElement(passbox).sendKeys(name);
	}
	public void click() {
		driver.findElement(submitclick).click();

	}
}

