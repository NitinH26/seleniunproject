package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task 
{
	@FindBy (xpath="(//div[text()='Android calibration'])[1]") private WebElement android_calibration;
	@FindBy (xpath="(//span[text()='REPORTED TIME '])[1]") private WebElement reportedTime;
	
	
	public Task(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
		
		public void clickOnAndroid_calibration()
		{
			android_calibration.click();	
		}
		
		public void clickOnReportedTime()
		{
			reportedTime.click();	
		}

}
