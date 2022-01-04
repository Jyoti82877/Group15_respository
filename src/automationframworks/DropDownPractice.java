package automationframworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownPractice {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805499%7Ce%7Cfacebook%20create%20new%20account%7C&placement=&creative=550525805499&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311595197486%26loc_physical_ms%3D1007780%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAzMGNBhCyARIsANpUkzODe0hlbkSyl_skrm4Ldyy6mAZrpV8axw9Ha-ApzEzl8HpzdWNpgiMaArtEEALw_wc");
		
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Jyoti");
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Shrivastava");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_o_')]")).sendKeys("8766423264");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jyoti123");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		day.sendKeys("15");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		month.sendKeys("Dec");
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		year.sendKeys("1986");
		
		
		
		
		
		
		
		
	}
}
