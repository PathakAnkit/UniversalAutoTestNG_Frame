package org.application.TableauPagesObjectRepo;

import org.application.LoginHome.HomePage;
import org.application.genericUtil.Excel_Editor;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyOverviewPage extends HomePage {

	public CompanyOverviewPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//iframe[@title='Data Visualization']")
	private WebElement iframeDataVisualization;
	
	@FindBy(xpath="//div[contains(text(),'Company Overview')]")
	private WebElement companyOverview;
	
//	@FindBy(xpath="(//canvas[@class='tabCanvas tab-widget'])[4]")
	@FindBy(id="view1164887678341463278_2062038300757041235")
	private WebElement Fabrication;
	
	@FindBy(xpath="//div[@class='tab-tvScrollY tvimages'][./div[@class='tvimagesContainer' and @style]]")
	private WebElement Scroll;
	
	@FindBy(xpath="//div[@class='tab-tooltip tab-widget tab-tooltipAR']//span[contains(text(),'Commodity')]/../..//td[3]//span")
	private WebElement Commodity;
	
	@FindBy(id="download-ToolbarButton")
	private WebElement DownloadTool;
	
	@FindBy(xpath="//button[@data-tb-test-id='DownloadData-Button']")
	private WebElement DownloadDataBtn;
	
	@FindBy(xpath="(//a[contains(text(),'Download all rows as a text file')])[1]")
	private WebElement DownloadCSVFile;
	
	public void switchiFrameWindow()
	{
		waitTillElementIsVisible(iframeDataVisualization);
		driver.switchTo().frame(iframeDataVisualization);
	}
	
	public void clickCompanyOverview()
	{
		waitTillElementIsVisible(companyOverview);
		moveToElement(companyOverview);
		companyOverview.click();
	}
	
	public void moveToFabrication()
	{
		waitTillElementIsVisible(Fabrication);
		scrollBottomElement(Scroll);
		scrollTopElement(Scroll);
		moveToElement(Fabrication, 0, 0);
//		Sikuli_Builder.sikuliClick("Fabrication");
		moveToElement(Scroll);
		
	}
	
	public void downloadInsuranceData() throws InterruptedException
	{
		waitTillElementIsVisible(DownloadTool);
		moveToElement(DownloadTool);
		DownloadTool.click();
		
		waitTillElementIsVisible(DownloadDataBtn);
		moveToElement(DownloadDataBtn);
		DownloadDataBtn.click();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		waitTillElementIsVisible(DownloadCSVFile);
		DownloadCSVFile.click();
		Thread.sleep(3000);
//		driver.close();
//		driver.switchTo().defaultContent();
	}
	
	public void changeFileExtension(String ActualSheetName, String newExtension)
	{
		changeExtension(ActualSheetName, newExtension);
	}
	
	public void compareDataSheets(String ActualSheet, String ActualTabName, String ExpectedSheet, String ExpectedTabName) 
	{
		int expectedRowCount = Excel_Editor.getRowCount(ExpectedSheet, ExpectedTabName);
				
		for(int p=1; p <= expectedRowCount; p++) { //loop starts
			try {
			if(Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 0).equalsIgnoreCase(Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 0))) {
				System.out.println("\nDestination is PASSED !\n");
				System.out.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 0)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 0));
			}else {
				System.err.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 0)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 0));
				Assert.fail("\nDestination is not Matching. ");
			}
			
			if(Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 1).equalsIgnoreCase(Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 1))) {
				System.out.println("\nYear is PASSED !\n");
				System.out.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 1)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 1));
			}else {
				System.err.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 1)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 1));
				Assert.fail("\nYear is not Matching. ");
			}
			
			
			if(Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 2).equalsIgnoreCase(Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 2))) {
				System.out.println("\nNet Sales is PASSED !\n");
				System.out.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 2)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 2));
			}else {
				System.err.print("Actual: "+Excel_Editor.getCellValue(ActualSheet, ActualTabName, p, 2)+" Expected: "+Excel_Editor.getCellValue(ExpectedSheet, ExpectedTabName, p, 2));
				Assert.fail("\nNet Sales is not Matching. ");
			}
			}catch(AssertionError ae) {
				System.out.println(ae.getMessage());
			}
			
			//loop ends
		}
		
	}
	
	
	
	
	
	

	//end of class
}
