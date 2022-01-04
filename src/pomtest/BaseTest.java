package pomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.DashBoardPage;
import pompage.LoginPage;

public class BaseTest {
	
	
  static WebDriver driver;
  
  LoginPage lp;
  DashBoardPage db;
  
  
	@BeforeSuite
	public void initDriver() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
	}
	
	@BeforeClass
	public void creatObject() {
		
		lp=new LoginPage(driver);
		db=new DashBoardPage(driver);
		
	}

}
