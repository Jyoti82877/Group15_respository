package automationframworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggetion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
		
		Actions act=new Actions(driver);
		
		act.click(searchbox).sendKeys("Selenium").build().perform();
		
		List<WebElement> searchresults = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//span[text()='selenium']"));
		
		for(WebElement searchresult:searchresults) {
			
			String searchtext = searchresult.getText();
			
			System.out.println("searchtext");
			
			if(searchtext.contains("totorial"))
			{
				searchresult.click();
				
				break;
			}
			
			
		}
		
		
		
		
	}

}
