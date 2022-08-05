package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header 
{
	@FindBy (xpath="//div[@id='container_tt']") private WebElement time_Track;
	@FindBy (xpath="//div[@id='container_tasks']") private WebElement task;
	@FindBy (xpath="//div[@id='container_reports']") private WebElement reports;
	@FindBy (xpath="") private WebElement users;
	@FindBy (xpath="//a[@id='logoutLink']") private WebElement logout;
	
	
	public Header(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
		public void clickOnTime_Track()
		{
			time_Track.click();
			
		}
		
		public void clickOnTask()
		{
			task.click();
		}
		
		public void clickOnReports()
		{
			reports.click();
		}
		
		public void clickOnLogout()
		{
			logout.click();
		}
		
	
}
