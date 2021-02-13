package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePageObjModel 
{
	WebDriver D = null;
	// created constructor  to use the D object of test case
	public LoginPagePageObjModel(WebDriver D)
	{
		this.D = D;
	}
	
	By Username = By.name("userName");
	By Password = By.name("password");
	By LoginClick = By.name("submit");
	
	public void EnterUsername(String TextValue)
	{
		D.findElement(Username).sendKeys(TextValue);
	}
	
	public void EnterPwd(String TextValue)
	{
		D.findElement(Password).sendKeys(TextValue);	
	}
	
	public void SubmitEnter()
	{
		D.findElement(LoginClick).click();
	}
}
