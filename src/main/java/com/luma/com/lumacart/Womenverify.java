package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Womenverify {

	WebDriver driver;
	
	
	public Womenverify(WebDriver d) {
		driver=d;
	}
	By sort=By.id("sorter");
	By product=By.linkText("Olivia 1/4 Zip Light Jacket");
	By sizer=By.xpath("//*[@id=\"option-label-size-143-item-168\"]");
	By color=By.xpath("//*[@id=\"option-label-color-93-item-50\"]");
	By quanty=By.id("qty");
	By clickon=By.id("product-addtocart-button");
	By chekout=By.id("top-cart-btn-checkout");
	By strt=By.name("street[0]");
	By strt1=By.name("street[1]");
	By strt2=By.name("street[2]");
	By city=By.name("city");
	By postal=By.name("postcode");
	By telephone=By.name("telephone");
	By next=By.xpath("//button[@class='button action continue primary']");
	By placing=By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
	
	
	
	public void sorter() {
		driver.findElement(sort).click();
	}
	public void productselect() {
		driver.findElement(product).click();
	}
	public void size() {
		driver.findElement(sizer).click();
	}
	public void colour() {
		driver.findElement(color).click();
	}
	public void quantity() {
		driver.findElement(quanty).clear();;
	}
	public void quantity(String num) {
		driver.findElement(quanty).sendKeys(num);
	}
	public void click() {
		driver.findElement(clickon).click();
	}
	public void checkout() {
		driver.findElement(chekout).click();
	}
	public void street(String name) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	}
	public void street1(String name) {
		driver.findElement(strt1).sendKeys(name);
	}
	public void strret2(String name) {
		driver.findElement(strt2).sendKeys(name);
	}
	public void city(String name) {
		driver.findElement(city).sendKeys(name);
	}
	public void select_region(){
		Select s=new Select(driver.findElement(By.name("region_id")));
		s.selectByIndex(2);
	}
	public void post(String name) {
		driver.findElement(postal).sendKeys(name);
	}
	public void select_country() {
		Select ss=new Select(driver.findElement(By.name("country_id")));
		ss.selectByIndex(2);
	}
	public void phone(String name) {
		driver.findElement(telephone).sendKeys(name);
	}
	public void selects(){
		driver.findElement(By.name("ko_unique_3")).click();
	}
	public void explicit() {
		WebDriverWait w=new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(driver.findElement(next)));
	}
	public void nextt() {
		driver.findElement(next).click();
	}
	public void place() {
		driver.findElement(placing).click();
	}
}
