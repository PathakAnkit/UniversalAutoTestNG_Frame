package org.application.MyntraPagesObjectRepo;


import org.application.LoginHome.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FastrackPage extends HomePage
{

	public FastrackPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//label[@title='Watches'])[2]")
	private WebElement Watches;
	
	@FindBy(css=".more")
	private WebElement expnd_more;
	
	@FindBy(xpath="//label[@title='Duffel Bag']")//li[@data-colorhex='Duffel-Bag'] | //li[@data-option='Duffel Bag']")
	private WebElement Duffel_Bag;
	
	@FindBy(xpath="//*[@placeholder='Search Categories']/..//div[@class='close']")
	private WebElement close_btn;
	
	
	public void checkWatches()
	{
		waitTillElementIsVisible(Watches);
		Watches.click();
	}
	
	public void expandMoreOptions()
	{
		waitTillElementIsVisible(expnd_more);
		expnd_more.click();
	}
	
	public void checkDuffel_Bag()
	{
		waitTillElementIsVisible(Duffel_Bag);
		Duffel_Bag.click();
	}
	
	public void closePopup()
	{
		waitTillElementIsVisible(close_btn);
		close_btn.click();
	}

}
