package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String url =driver.getCurrentUrl();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		
	WebElement password = driver.findElement(By.id("txtPassword"));
	
	password.sendKeys("admin123");
	
//WebElement login = driver.findElement(By.className("btnLogin"));
	
//WebElement loginbutton = driver.findElement(By.className("button"));

//loginbutton.click();

//WebElement link = driver.findElement(By.linkText("Forgot your password?"));

//link.click();


 WebElement partaillink = driver.findElement(By.partialLinkText("OrangeHRM, Inc"));

 partaillink.click();
 
 WebElement forgetlink = driver.findElement(By.partialLinkText("your"));
 
 forgetlink.click();
	
	}
	

}
