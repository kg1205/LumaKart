package lumafine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Tc_001 extends Baseclass {
	
	@Test
	
	public void test() {
		//driver.get(baseurl);
		logg.info("url has opened");
	
		LoginPage l=new LoginPage(driver);
		l.emailid(usern);
		l.pass(passw);
		l.submitb();
		
		HomePage h=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		h.actions();
		h.list();
		h.size();
		h.colors();
		//h.addtocart();
		
		
		
		
	}
	
}
