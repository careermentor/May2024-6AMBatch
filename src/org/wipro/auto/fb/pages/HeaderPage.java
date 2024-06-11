package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.fb.utilitiespkg.ReadPropFile;

public class HeaderPage 
{

	//because "this.driver" is null
	
	WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
	}


	
	public void click_investor() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("Header_invester_xpath"))).click();
	}
	
}
