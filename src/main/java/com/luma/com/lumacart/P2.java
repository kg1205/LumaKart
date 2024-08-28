package com.luma.com.lumacart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P2 {

	WebDriver driver;
	

	public P2(WebDriver d) {
		driver = d;
	}

	By searchbox = By.name("q");
	By searchb = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
	By clicklink = By.partialLinkText("SeleniumByMahesh | Learn From Expert");

	public void search(String name) {
		driver.findElement(searchbox).sendKeys(name);
	}

	public void searchbutton() {
		driver.findElement(searchb).click();
	}

	public void clickonlink() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(clicklink).click();
	}

}
