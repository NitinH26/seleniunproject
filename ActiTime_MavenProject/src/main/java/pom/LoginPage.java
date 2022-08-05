package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy (xpath="//input[@id='username']") private WebElement userName;
	@FindBy (xpath="//input[@class='textField pwdfield']") private WebElement password;
	@FindBy (xpath="//a[@id='loginButton']") private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String a)
	{
		userName.sendKeys(a);
	}
	
	public void enterPassword(String b)
	{
		password.sendKeys(b);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

}
