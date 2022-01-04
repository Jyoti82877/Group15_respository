package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUps {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleclickbutton).build().perform();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().accept(); //to click on button
		
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		
		driver.switchTo().alert().dismiss(); //to click cancel button
		
		
		
		
		
	}

}
