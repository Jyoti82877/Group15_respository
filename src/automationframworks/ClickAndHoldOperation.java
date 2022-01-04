package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldOperation {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
	    driver.switchTo().frame(iframe);//get in to in iframe
		
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(slider).moveByOffset(300, 0).moveByOffset(-100, 0).release().build().perform();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[@class='menu-item'][1]")).click();
		
		
		
		
		
	}

}
