package org.application.TestScenarios;

import org.application.TableauPagesObjectRepo.CompanyOverviewPage;
import org.application.base.BasePageTest;
import org.testng.annotations.Test;

public class Tableau_TC01 extends BasePageTest {

	@Test
	public void dataAnalyticsAutomation() throws InterruptedException {
		
		CompanyOverviewPage cop = new CompanyOverviewPage(driver);
		cop.switchiFrameWindow();
//		cop.clickCompanyOverview();
//		cop.moveToFabrication();
		cop.downloadInsuranceData();
//		cop.changeFileExtension("Net_sale_by_destination_data.csv", "xlsx");
		cop.compareDataSheets("Net_sale_by_destination_data.csv", "Net_sale_by_destination_data", "Expected_Insurance_Dashboard.xlsx", "Actual_Values");
		
	}

	// end of class
}
