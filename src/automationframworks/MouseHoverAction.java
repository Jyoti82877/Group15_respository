package automationframworks;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		
	 WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
	 
	 Actions act=new Actions(driver);
	 
	 
		act.moveToElement(admintab).build().perform();
		
		WebElement usermanagment = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		
		act.moveToElement(usermanagment).build().perform();
		
		usermanagment.click();

	}

}
