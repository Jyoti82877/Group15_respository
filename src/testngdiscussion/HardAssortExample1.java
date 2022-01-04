package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssortExample1 {
	
	@Test
	public void validateErrorMessage() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
         driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("addmin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		WebElement message = driver.findElement(By.xpath("//*[@id='spanMessage']"));
		
		String messagestring = message.getText();

		System.out.println("messagestring");
		
		 String expectedmessage="invalid credentails";
		 
		 Assert.assertEquals(messagestring, expectedmessage);
		
		
	}
	
	
	
	

}
