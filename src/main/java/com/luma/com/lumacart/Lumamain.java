package com.luma.com.lumacart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lumamain {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		driver.manage().window().maximize();
		
		/*
		 * Registpage regd=new Registpage(driver); regd.firstname("ganesh");
		 * regd.lastname("gani"); regd.emailid("gani@gmail.com");
		 * regd.password("Ganesh123"); regd.cofmpassw("anesh123"); regd.clickon();
		 */
		
		signin s=new signin(driver);
		s.signinpage();
		s.email("gani@gmail.com");
		s.password("Ganesh123");
		s.clickon();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Jackets"))).click().build().perform();
	
		Womenverify w=new Womenverify(driver);
		w.sorter();
		w.productselect();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		w.size();
		w.colour();
		w.quantity();
		w.quantity("2");
		w.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='action showcart']"))).click().build().perform();
		w.checkout();
		//w.street("hyd11");
		//w.street1("hyd2");
		//w.strret2("kjsdkbkjsd");
		//w.city("hyderabad");
		//w.select_region();
		//w.post("33654");
		//w.select_country();
		//w.phone("4641545");
		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * //w.selects();
		 */	
		//w.explicit();
		w.nextt();
		w.place();
		
	}

}
