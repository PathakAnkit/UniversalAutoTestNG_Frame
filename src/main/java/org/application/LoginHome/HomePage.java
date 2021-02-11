package org.application.LoginHome;

import org.application.base.BaseInteractions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseInteractions
{
	@FindBy(xpath="(//div[@class='desktop-user']/div[1] | //span[contains(text(),'Profile')]")
	private WebElement lgn_icon;
	
	@FindBy(xpath="//a[contains(text(),'login / Signup')]")
	private WebElement login;
		
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath="//*[@class='logo']")
	private WebElement myntra_logo; 
	
	@FindBy(xpath="//div[@class='wm-close-button walkme-x-button']")
	private WebElement welcomeCloseButton;
	
	@FindBy(xpath="//a[@class='CardView_thumbnail-preloaded_f1vpb8ks CardView_card-highlight_fpkmb0m']")
	private WebElement presenationIcon;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}


	public void moveToLoginIcon(){
		waitTillElementIsVisible(lgn_icon);
		moveToElement(lgn_icon);
	}
	
	public void clickLoginbtn(){
		waitTillElementIsVisible(login);
		login.click();
	}
	
	
	public void clickLogout(){
		waitTillElementIsVisible(logout);
		logout.click();
	}
	
	public void clickMyntraHome()
	{
		waitTillElementIsVisible(myntra_logo);
		myntra_logo.click();
	}
	
	
	public void closeButtonOnWelcome() 
	{
		waitTillElementIsVisible(welcomeCloseButton);
		welcomeCloseButton.click();
	}
	
	public void clickOnPresentation()
	{
		waitTillElementIsVisible(presenationIcon);
		moveToElement(presenationIcon);
		presenationIcon.click();
	}
	
	//end of class
}
