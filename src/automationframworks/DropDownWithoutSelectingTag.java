package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelectingTag {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signup");
		
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='select-item-select-0-2']")).click();
		
		
		
		
	}

}
