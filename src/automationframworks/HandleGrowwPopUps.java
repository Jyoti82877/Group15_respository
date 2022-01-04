package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleGrowwPopUps {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
	driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary'][1]")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	}

}
