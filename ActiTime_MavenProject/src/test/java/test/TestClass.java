package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import pom.Header;
import pom.LoginPage;
import utils.UtilityClass;

public class TestClass extends BaseClass
{
	LoginPage loginPage;
	Header header;
	int TestID;
	
	
	@BeforeTest
	@Parameters("browserName")
	public void openBrowser(String browserName )
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			launchChromeBrowser();
		}
		
		if(browserName.equalsIgnoreCase("MicrosoftEdge"))
		{
			 launchMicrosoftEdge();
		}
		
		if(browserName.equalsIgnoreCase("InternetExplorer"))
		{
			launchInternetExplorer();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createPOMObject()
	{
		
		 loginPage=new LoginPage(driver);
		 header=new Header(driver);
		
	}
	
	@BeforeMethod
	public void loginToApplication() throws IOException
	{
		driver.get("https://online.actitime.com/nh/login.do");
		
		 
			loginPage.enterUserName(UtilityClass.actiTimeData("UN"));
			loginPage.enterPassword(UtilityClass.actiTimeData("PSW"));
			loginPage.clickOnLoginButton();
	}
	
	@Test
	public void verifyTime_trackTab() throws IOException, InterruptedException
	{
		TestID=101;
			header.clickOnTime_Track();
			Thread.sleep(2000);
			
			String actual_url=driver.getCurrentUrl();	
			String actual_title=driver.getTitle();
			//System.out.println(actual_url);
			
			String expected_url= UtilityClass.actiTimeData("TTURL");
			String expected_title= UtilityClass.actiTimeData("TTTITLE");
			
			Assert.assertEquals(actual_url,expected_url);
			Assert.assertEquals(actual_title, expected_title);
	}
	
	
	@Test(priority=1)
	public void verifyTaskTab() throws InterruptedException, IOException 
	{
		TestID=102;
		header.clickOnTask();
		Thread.sleep(2000);
		
		String actual_url=driver.getCurrentUrl();	
		String actual_title=driver.getTitle();
		
		String expected_url= UtilityClass.actiTimeData("TASKURL");
		String expected_title= UtilityClass.actiTimeData("TASKTITLE");
		
		Assert.assertEquals(actual_url,expected_url);
		Assert.assertEquals(actual_title, expected_title);
		
	}
	
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws InterruptedException, IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			UtilityClass.captureScreenshot(driver,TestID);
		}
		
		Thread.sleep(2000);
		header.clickOnLogout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
	}
	
	
	
}
