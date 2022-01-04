package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsInSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='hidden']")));
		
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		
		driver.findElement(By.xpath("//*[text()='site']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='h2']")));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
	}

}
