package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	    FunctionLibrary FL = new FunctionLibrary();
	    FL.LaunchWeb();
	    FL.Login();
	    FL.Logout();
	}

}
