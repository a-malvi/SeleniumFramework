import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPage;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup(); // used driver manager maven dependency
	     WebDriver D = new ChromeDriver();
	    
	   
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	//	String projectPath = System.getProperty("user.dir");
	//	System.out.println(projectPath);
	 //   System.setProperty("webdriver.chrome.driver", projectPath + "\Driver\ChromeDriver\chromedriver.exe");
	     String URL = "http://demo.guru99.com/test/newtours/";
		 D.get(URL);
	     LoginPage.username_button(D).sendKeys("admin");
	     LoginPage.enterpassword(D).sendKeys("admin");
	     LoginPage.pressSubit(D).click();
	}

}
