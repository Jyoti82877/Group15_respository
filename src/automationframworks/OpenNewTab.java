package automationframworks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle();
		System.out.println("parent window id is: "+parentid);
		
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allwindowid = driver.getWindowHandles();
		for(String winid:allwindowid)
		{
		System.out.println(winid);
		
		
	}

	}
}