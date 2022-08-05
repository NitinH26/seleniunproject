package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class UtilityClass 
{
	
	public static void main(String[] args) {
		
	}
	public static String actiTimeData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\hniti\\eclipse-workspace\\selenium\\src\\actiTime\\actiTimePFile");
		
		Properties p=new Properties();
		p.load(file);
		
		String value=p.getProperty(key);
		
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TestID) throws IOException 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hniti\\eclipse-workspace\\ActiTime_MavenProject\\Screenshots\\"+TestID+".jpg");
		
		FileHandler.copy(src, dest);
	
		
	}

	}
