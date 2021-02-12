package org.application.browserSettings;

import java.util.HashMap;

import org.application.constant.UniversalConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
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
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> chromePref = new HashMap<>();
			chromePref.put("download.default_directory", (System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"));
			options.setExperimentalOption("prefs", chromePref);
			System.setProperty(CHROME_KEY,DRIVER_PATH+CHROME_FILE);
			driver  = new ChromeDriver(options);
			break;
		
		case"gecko":
			FirefoxProfile fxProfile = new FirefoxProfile();
			fxProfile.setPreference("browser.download.folderList",2);
			fxProfile.setPreference("browser.download.manager.showWhenStarting", false);
			fxProfile.setPreference("browser.download.dir", (System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"));
			fxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/csv");
			System.setProperty(GECKO_KEY,DRIVER_PATH+GECKO_FILE);
			driver  = new FirefoxDriver(new FirefoxOptions().setProfile(fxProfile));
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
