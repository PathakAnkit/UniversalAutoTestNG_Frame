package org.application.MyntraPagesObjectRepo;


import org.application.LoginHome.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRXBannerPage extends HomePage
{

	@FindBy(xpath="//label[@title='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath="//div[.='19 more']")
	private WebElement Nineteen_more;
	
	@FindBy(xpath="//li[@data-colorhex='Sweatshirts'] | //li[@data-option='Sweatshirts']")
	private WebElement Sweatshirts;
	
	@FindBy(xpath="//*[@placeholder='Search Categories']/..//div[@class='close']")
	private WebElement close_btn;
	
	public HRXBannerPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}	
	
	public void checkShirts()
	{
		waitTillElementIsVisible(shirts);
		shirts.click();
	}
	
	public void expandMoreOptions()
	{
		waitTillElementIsVisible(Nineteen_more);
		Nineteen_more.click();
	}
	
	public void checkSweatshirts()
	{
		waitTillElementIsVisible(Sweatshirts);
		Sweatshirts.click();
	}
	
	public void closePopup()
	{
		waitTillElementIsVisible(close_btn);
		close_btn.click();
	}
	

}
