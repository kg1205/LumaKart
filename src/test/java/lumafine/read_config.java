package lumafine;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class read_config {

	Properties pro;
	
	public read_config() {
		File f=new File("./configurations/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
		
		
			}
		public String geturl() {
			String url=pro.getProperty("baseurl");
			return url;
	}
		public String getusername() {
			String usname=pro.getProperty("usename");
			return usname;
			
		}
		public String getpass() {
			String pass=pro.getProperty("pass");
			return pass;
		}
		public String getchrome() {
			String chrome=pro.getProperty("chromepath");
			return chrome;
		}
	
}
