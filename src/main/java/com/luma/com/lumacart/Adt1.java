package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adt1 {

	WebDriver driver;
	
	public Adt1(WebDriver d) {
		driver=d;
	}
	
	By adtlink=By.linkText("ADT");
	By save_button=By.xpath("/html/body/div[2]/div/div[2]/form/table[2]/tbody/tr/td[1]/input");
	
	
	public void adt() {
		driver.findElement(adtlink).click();
	}
	public void save() {
		driver.findElement(save_button).click();
	}
}
