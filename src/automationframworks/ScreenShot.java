package automationframworks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

import utility.ScreenShots;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium_jar\\\\Chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		
	File source=scrshot.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("D:\\Selenium_jar\\Screenshots\\facebook.png");
		
		FileHandler.copy(source, destination);
		
		ScreenShots.captureScreenshots(driver, "secondscreenshot");
		
	}
	
	

}
