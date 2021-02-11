package org.application.browserSettings;

import org.application.constant.UniversalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetBrowserConfiguration implements UniversalConstants {

	public static WebDriver driver;

	public static WebDriver setBrowser(String Browser) {
		
		switch(Browser.toLowerCase()) {
		
		case"ie":
			System.setProperty(IE_KEY,DRIVER_PATH+IE_FILE);
			driver = new InternetExplorerDriver();
			break;
			
		case"chrome":
			System.setProperty(CHROME_KEY,DRIVER_PATH+CHROME_FILE);
			driver  = new ChromeDriver();
			break;
		
		case"gecko":
			System.setProperty(GECKO_KEY,DRIVER_PATH+GECKO_FILE);
			driver  = new FirefoxDriver();
			break;
			
		case"edge":
			System.setProperty(EDGE_KEY,DRIVER_PATH+EDGE_FILE);
			driver  = new EdgeDriver();
			break;
			
		default:
			System.setProperty(CHROME_KEY,DRIVER_PATH+CHROME_FILE);
			driver  = new ChromeDriver();
			break;
		
		}
		
		return driver;
		
	}
	

	// end of class
}
