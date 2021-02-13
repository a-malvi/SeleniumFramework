import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPagePageObjModel;
public class BrowserTestwithPageObjectsTestNG {
	
/* removed main class as it is now a TestNG class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 */
	WebDriver D = null;
	
	@BeforeTest
		public void setUp()
		{
     	WebDriverManager.chromedriver().setup(); // used driver manager maven dependency
	     D = new ChromeDriver();
	     String URL = "http://demo.guru99.com/test/newtours/";
		 D.get(URL);
		}
	
	@Test
		 public void login()
		 {
		 LoginPagePageObjModel LPOM = new LoginPagePageObjModel(D);
	     LPOM.EnterUsername("admin");
	     LPOM.EnterPwd("admin");
	     LPOM.SubmitEnter();
		 }
	     
	@AfterTest
	    public void completeTest()
	    {
		 D.quit();
	   //  D.close();
		System.out.println("Test Completed");
	    }

}
