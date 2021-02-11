package org.application.TestScenarios;

import org.application.MyntraPagesObjectRepo.CompanyOverviewPage;
import org.application.base.BasePageTest;
import org.testng.annotations.Test;

public class Tableau_TC01 extends BasePageTest {

	@Test
	public void dataAnalyticsAutomation() throws InterruptedException {
		
		CompanyOverviewPage cop = new CompanyOverviewPage(driver);
		cop.switchiFrameWindow();
		cop.clickCompanyOverview();
		cop.moveToFabrication();
		

	}

	// end of class
}
