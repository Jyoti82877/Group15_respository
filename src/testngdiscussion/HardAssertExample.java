package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertExample {
	
	public void urlTest() {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		String url = driver.getCurrentUrl();
		
		boolean ispresent = url.contains("dashboardd");

		Assert.assertEquals(ispresent, "Test case is failed please file a bug");

		System.out.println("last line of test case");
		
		}
	
	public void testCase2() {
		String s="abc";
		
	boolean isequal = s.equals("abc");
	
	Assert.assertEquals(isequal, "assertion failed please check");
		System.out.println("last line");
	}

}
