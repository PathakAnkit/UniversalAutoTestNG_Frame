package org.application.base;


import java.io.File;

import org.apache.log4j.Logger;
import org.application.constant.UniversalConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseInteractions {

	  public Logger log=Logger.getLogger(this.getClass());
	  public WebDriver driver;
	  public String configFile;
	  public long timeout;
	  
	  
	  public BaseInteractions(WebDriver driver)
	  {
		  this.driver=driver;
		  configFile=UniversalConstants.CONFIG_PATH+UniversalConstants.CONFIG_FILE;
		  //timeout=Long.parseLong(Property.getPropertyValue(configFile, "IMPLICIT"));
	  }

	  public void waitTillElementIsVisible(WebElement element)
	  {
		  new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element)); //.visibilityOf(element)
	  }
		  
	  
	  public void verifyURLis(String expectedUrl){
		  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlToBe(expectedUrl));
	  }
	  
	  public void verifyURLhas(String expectedUrl){
		  new WebDriverWait(driver,timeout).until(ExpectedConditions.urlContains(expectedUrl));
	  }

		  
	  public void moveToElement(WebElement element)
	  {
		 Actions actions=new Actions(driver);
		 actions.moveToElement(element).perform();
	  }
	  
	  public void moveToElement(WebElement element, int x, int y)
	  {
		 Actions actions=new Actions(driver);
		 actions.moveToElement(element, x, y).perform();
		 ((JavascriptExecutor)driver).executeScript("var evt = $.Event('click', { pageX: " + x +", pageY: " + (y + 55) + " } );" + "$('#diagramCanvas').trigger(evt);");

	  }
	  
	  
	  public void scrollFunction(WebElement element)
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,"+element.getLocation().getY()+")");
	  }
	  
	  public void getXandYCoordinates(WebElement element)
	  {
		  System.out.println("Elements X-coordinates: "+element.getLocation().getX());
		  System.out.println("Elements Y-coordinates: "+element.getLocation().getY());
	  }
	  
	  public void jsmoveToElement(WebElement element, int x, int y)
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
	      jse.executeScript("arguments[0].scrollIntoView(true);"+"window.scrollBy("+x+","+y+")", element);
	  }
	  
	  public void scrollTopElement(WebElement element)
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  for(int i=0;i<=9;i++) {
			  jse.executeScript("arguments[0].scrollTop = ("+i*49+", 0)", element);
		  }
	  }
	  
	  public void scrollBottomElement(WebElement element)
	  {
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  for(int i=0;i<=9;i++) {
			  jse.executeScript("arguments[0].scrollTop = (0, "+i*49+")", element);
		  }
	  }
	  
	  public void deleteFileInDataExcel(String FileName) 
	  {
		  try {
		    File file = new File((System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"+FileName)); 
          
	        if(file.delete()) 
	        { 
	            System.out.println("File deleted successfully"); 
	        } 
	        else
	        { 
	            System.out.println("Failed to delete the file"); 
	        } 
		  }catch(Exception e) {
			  System.err.println(e.getMessage());
		  }
	  }

	  
	  public File changeExtension(String FileName, String extension) {
		    File file = new File((System.getProperty("user.dir") + "\\src\\test\\resources\\DataExcel\\"+FileName));
		    String filename = file.getName();

		    if (filename.contains(".")) {
		        filename = filename.substring(0, filename.lastIndexOf('.'));
		    }
		    filename += "." + extension;

		    file.renameTo(new File(file.getParentFile(), filename));
		    return file;
		}
	
	//end of class
}
