package automationframworks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println("Parent window id is: "+parentid);
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allwindowid = driver.getWindowHandles();
		
		for(String winid:allwindowid)
		{
			
			
			if(!(winid.equalsIgnoreCase(parentid)));
			
			{
				
				driver.switchTo().window(winid);
				
				Thread.sleep(6000);
				
			driver.findElement(By.xpath("//*[@class='btn-orange contact-ohrm ']")).click();
			
			driver.get("https://www.google.com/");
				
				
					}
			
			System.out.println(winid);
		    
			driver.close();
			
			
			driver.switchTo().window(parentid);
			
			driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
			
			driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
			
			driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
			
			
		}
		
	}

}
