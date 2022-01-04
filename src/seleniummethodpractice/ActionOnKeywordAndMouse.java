package seleniummethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionOnKeywordAndMouse {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		WebElement admintab = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(admintab).perform();
		
		act.contextClick(admintab).perform();
	}
}


