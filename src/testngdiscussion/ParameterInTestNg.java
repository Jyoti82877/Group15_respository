package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNg {
	
	static WebDriver driver;
	
	@Parameters("urltobelaunch")
	
	@Test
	public void launchFacebook(String url) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		if(url.contains("facebook"))
		{
			
			driver.get(url);
		}
		
		else {
			
			driver.get("https://www.google.com/");
		}
		
	}
	
	@Parameters({"environment" , "buildversion"})
	
	@Test
	public void info(String env, String version) {
		
		System.out.println("The version is :"+version);
		System.out.println("The environment is:"+env);
	}

}
