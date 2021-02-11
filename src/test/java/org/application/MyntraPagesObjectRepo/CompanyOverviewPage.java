package org.application.MyntraPagesObjectRepo;

import org.application.LoginHome.HomePage;
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
	
	public void moveToFabrication() throws InterruptedException
	{
		waitTillElementIsVisible(Fabrication);
//		getXandYCoordinates(Fabrication);
		scrollBottomElement(Scroll);
		Thread.sleep(5000);
		scrollTopElement(Scroll);
		moveToElement(Fabrication, 0, 0);
//		Sikuli_Builder.sikuliClick("Fabrication");
//		System.out.println("Commodity: "+Commodity.getText());
		moveToElement(Scroll);
		
	}
	
	
	
	

	//end of class
}
