package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basepkg.InitiateBrowser;
import org.wipro.auto.fb.pages.HeaderPage;

public class HeaderScenario extends InitiateBrowser
{

	@Test
	public void tc01_validatefirstlineHeaderlinks() throws Exception
	{
		HeaderPage head1 = new HeaderPage(driver);
		
		head1.click_investor();
	}
	
	
	
}
