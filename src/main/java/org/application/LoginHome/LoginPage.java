package org.application.LoginHome;



import org.application.base.BaseInteractions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseInteractions
{

	@FindBy(name="email")
	private WebElement txtUsername;
	
	@FindBy(name="password")
	private WebElement txtPassword;
	
	@FindBy(id="login-submit")
	private WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		txtUsername.sendKeys(un);
	}

	public void setPassword(String pw){
		txtPassword.sendKeys(pw);
	}
	
	public void clickLogin(){
		btnLogin.click();
	}
	

}



