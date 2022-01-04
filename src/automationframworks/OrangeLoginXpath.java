package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLoginXpath {
	
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
			
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	
	//driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_10']")).click();
	//driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_10']")).click();
	//driver.findElement(By.xpath("//button[contains(@id,'u_0_a_')]")).click();
	
	//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	
	driver.findElement(By.xpath("(//*[@type='checkbox'])[4]")).click();
	
	
	}
	}


