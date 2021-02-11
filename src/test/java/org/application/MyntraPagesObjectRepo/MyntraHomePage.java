package org.application.MyntraPagesObjectRepo;


import org.application.LoginHome.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraHomePage extends HomePage
{
	public MyntraHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[text()='Handpicked']")
	public WebElement handpick;
	
	@FindBy(xpath="(//div[@class='card-text'])[3]//span[1]")  //span[.='Fastrack']
    public WebElement FastrackCard;
	
	
	public void scrollUPTO()
	{
		waitTillElementIsVisible(handpick);
		scrollFunction(handpick);
	}
	
	public void clickFastrack()
	{
		waitTillElementIsVisible(FastrackCard);
		FastrackCard.click();
	}
	
	

}
