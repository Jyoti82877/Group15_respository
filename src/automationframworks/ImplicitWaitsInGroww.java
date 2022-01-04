package automationframworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitsInGroww {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//*[@class='btn51Btn btn51RipplePrimary btn51Primary'])[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Continue']")).click();
		
		driver.findElement(By.xpath("//*[@id='login_password1']")).sendKeys("Abc1234");
		
	}

}
