package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass 
{
	public WebDriver driver;
	public  WebDriver launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SQL ORACLE SELENIUM SOAP Poi\\Selenium\\chromedriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		return driver;
	}

	public WebDriver launchMicrosoftEdge()
	{
		System.setProperty("webdriver.edge.driver","D:\\SQL ORACLE SELENIUM SOAP Poi\\Selenium\\Microsoft edge\\msedgedriver.exe");
		
		 driver=new EdgeDriver();
		return driver;
	}
	
	public WebDriver launchInternetExplorer()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SQL ORACLE SELENIUM SOAP Poi\\Selenium\\chromedriver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		return driver;
	}
	
}
