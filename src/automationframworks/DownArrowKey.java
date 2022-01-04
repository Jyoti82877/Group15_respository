package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownArrowKey {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
	
		Actions act=new Actions(driver);
		
		act.click(searchbox).sendKeys("Selenium").build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	
	}

}
