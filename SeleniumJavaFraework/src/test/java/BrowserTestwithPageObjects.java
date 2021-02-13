import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.LoginPagePageObjModel;
public class BrowserTestwithPageObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); // used driver manager maven dependency
	     WebDriver D = new ChromeDriver();
	     String URL = "http://demo.guru99.com/test/newtours/";
		 D.get(URL);
	     LoginPagePageObjModel LPOM = new LoginPagePageObjModel(D);
	     LPOM.EnterUsername("admin");
	     LPOM.EnterPwd("admin");
	     LPOM.SubmitEnter();
	     
	     D.close();
	}

}
