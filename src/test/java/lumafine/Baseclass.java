package lumafine;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Baseclass implements ITestListener {
	public WebDriver driver;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest tester;

	read_config read = new read_config();
	public String baseurl = read.geturl();
	public String usern = read.getusername();
	public String passw = read.getpass();
	public static Logger logg;

	@BeforeClass
	public void beforeClass() {
		logg = Logger.getLogger("base");
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", read.getchrome());
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

	}

	public void onTestSuccess(ITestResult result) {
		  System.out.println("passed ganeshhh test"); 
		  Date dt = new Date(); 
		  DateFormat  dtfrmt = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss"); 
		  String path =System.getProperty("/.screenshots"); 
		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  try 
		  { FileUtils.copyFile(f, new File(path + "/screen/" + "gani.png")); }
		  catch (IOException e) 
		  { 
		  e.printStackTrace(); 
		  } 
		  }

/*
 * public void passed() throws Exception {
 * 
 * Date dt = new Date(); DateFormat dtfrmt = new
 * SimpleDateFormat("yyyy_MM_dd_hh_mm_ss"); String path =
 * System.getProperty("/.screenshots"); File f = ((TakesScreenshot)
 * driver).getScreenshotAs(OutputType.FILE); FileUtils.copyFile(f, new File(path
 * +"gani.png"));
 * 
 * String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
 * Date()); String rep="testreport"+timestamp+".html"; htmlreporter=new
 * ExtentHtmlReporter(System.getProperty("/.screenshots/")+rep);
 * 
 * extent=new ExtentReports(); extent.attachReporter(htmlreporter);
 * extent.setSystemInfo("hostname", "localhost");
 * extent.setSystemInfo("environment", "qa"); extent.setSystemInfo("user",
 * "ganesh");
 * 
 * htmlreporter.config().setDocumentTitle("lumacart test project");
 * htmlreporter.config().setReportName("functional report");
 * htmlreporter.config().setTheme(Theme.DARK);
 * 
 * 
 * }
 */
}
