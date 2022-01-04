package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dog {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zigly.com/onlinevetconsultation");
		
		driver.findElement(By.xpath("(//*[@class='freebirdFormviewerComponentsQuestionBaseTitle exportItemTitle freebirdCustomFont'])")).click();
		
		driver.findElement(By.xpath("(//*[@class='appsMaterialWizToggleRadiogroupOnRadio exportInnerCircle'])[1]")).click();
		
		
		
	}

}
