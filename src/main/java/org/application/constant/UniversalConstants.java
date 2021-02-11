package org.application.constant;

public interface UniversalConstants {
	
	public static  final String DRIVER_PATH=(System.getProperty("user.dir") + "\\src\\main\\resources\\exeDrivers\\");
	public static  final String CHROME_FILE="chromedriver.exe";
	public static  final String GECKO_FILE="geckodriver.exe";
	public static  final String IE_FILE="IEDriverServer.exe";
	public static  final String EDGE_FILE="msedgedriver.exe";
	
	public static  final String CHROME_KEY="webdriver.chrome.driver";
	public static  final String GECKO_KEY="webdriver.gecko.driver";
	public static  final String IE_KEY="webdriver.ie.driver";
	public static  final String EDGE_KEY="webdriver.edge.driver";
	
	public static 	final String EXCEL_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\");
	public static 	final String INPUT_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\DataLib.xlsx");
	public static  final String CONFIG_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\Configurations\\");
	public static  final String CONFIG_FILE="config.properties";

	
	public static  final String REPORT_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\TestReports\\");
	public static  final String REPORT_FILE="report.html";
	public static  final String SCREENCAP_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\FailedTestScreenShots\\");
	public static  final String SIKULI_PATH=(System.getProperty("user.dir") + "\\src\\test\\resources\\SikuliTestImageBank\\");

	
}
