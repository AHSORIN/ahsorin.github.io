package com.trello.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		try {
			prop=new Properties();
			FileInputStream fs=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\sample\\src\\main\\java\\com\\trello\\config\\config.properties");
		     prop.load(fs);
		     
		
		
		}
		catch(Exception e) {
	        e.printStackTrace();
			
		}
	}
		
		public static void initialization(){
			 
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\hp\\eclipse-workspace\\sample\\Drivers\\chromedriver.exe" );
			    driver=new ChromeDriver();
			   driver.manage().deleteAllCookies();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
			   driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
			   driver.get(prop.getProperty("url"));
			}
			 	
		}

}
