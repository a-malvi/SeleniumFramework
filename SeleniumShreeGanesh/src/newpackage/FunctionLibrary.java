package newpackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionLibrary 
{
	 WebDriver D = new ChromeDriver();
	// Load the properties File		
	      //  Properties obje = new Properties();					
	      //  objfile = new FileInputStream(System.getProperty("C:\\SeleniumTestSpace\\1\\SeleniumShreeGanesh\\app.properties"));	
	     //   Obje.load(objfile);
	    //C:\SeleniumTestSpace\1\SeleniumShreeGanesh\app.properties
	//    obje.load()
	    
	public void LaunchWeb()
	{
		 String URL = "http://demo.guru99.com/test/newtours/";
		 D.get(URL);
	}
	public void Login()
	 {    
		  WebElement UID = D.findElement(By.name("userName"));
		  UID.sendKeys("admin");
		  WebElement PWD = D.findElement(By.name("password"));
	      PWD.sendKeys("admin");
		  D.findElement(By.name("submit")).click();
	 }
	public void Logout()
	{
		D.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click(); 
		
	}
	
}
