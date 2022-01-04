package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	String url=driver.getCurrentUrl();
	
		WebElement email1 = driver.findElement(By.id("email"));
		
	
	email1.sendKeys("jyoti.shrivastavars@gmail.com");
	     
	    WebElement pass1 = driver.findElement(By.id("pass"));
	    
	    pass1.sendKeys("rashmi123");
	    
	   WebElement login = driver.findElement(By.className("login"));
	   login.click();
	
	 driver.findElement(By.xpath("//button[contains(@id,'u_0_a_')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		
		
		
		
		
	}

}
