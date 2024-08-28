package lumafine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver d) {
		this.driver = d;
	}

	public void actions() {
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.id("ui-id-5"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-17"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-21"))).click().build().perform();

	}

	By lists = By.xpath("//div[@class='sidebar sidebar-main']");
	By sizes = By.id("option-label-size-143-item-168");
	By colour = By.id("option-label-color-93-item-50");
	By addcart = By.xpath("(//button[@class='action tocart primary'])[position()=5]");

	public void list() {
		String lst = driver.findElement(lists).getText();
		String[] ls = lst.split("\n");
		for (int i = 0; i < ls.length; i++) {
			System.out.println(ls[i]);
		}
	}

	public void size() {
		driver.findElement(sizes).click();
	}

	public void colors() {
		driver.findElement(colour).click();

	}

	public void addtocart() {
		driver.findElement(addcart).click();
	}
	
}
