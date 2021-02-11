package org.application.TestScenarios;


import org.application.MyntraPagesObjectRepo.FastrackPage;
import org.application.MyntraPagesObjectRepo.MyntraHomePage;
import org.application.base.BasePageTest;
import org.testng.annotations.Test;

public class Gotofastrack_TC01 extends BasePageTest 
{
	  @Test
	  public void executingScript() 
	  {	  
			
		  MyntraHomePage mhp=new MyntraHomePage(driver);
	  
		  mhp.scrollUPTO();
		  
		  mhp.clickFastrack();
		 
		  FastrackPage fstp=new FastrackPage(driver);
		  
		  fstp.checkWatches();
		  
		  fstp.expandMoreOptions();
		  
		  fstp.checkDuffel_Bag();
		  
		  fstp.closePopup();

		  mhp.clickMyntraHome();
		  
		  
	  }

}
