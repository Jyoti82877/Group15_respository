package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsActualUsage {
	@BeforeSuite
	public void openBrowser() {
		
		System.out.println("Browser get open");
	}
	@AfterSuite
	public void quitBrowser() {
		
		System.out.println("Browser got shutdown");
	}
	@BeforeTest
	public void navToUrl() {
		
		System.out.println("Navigate to url");
	}
    @AfterTest
	public void backToOriginalUrl() {
		
		System.out.println("back to original url");
	}
    @BeforeClass
    public void loginToApp() {
    	
    	System.out.println("login in to application");
    }
    @AfterClass
    public void loggOff() {
    	
    	System.out.println("logging off from the application");
    }
    @BeforeMethod
    public void navigateToSpecificLocation() {
    	
    	System.out.println("navigate to specific location");
    }
    @AfterMethod
   public void backToOriginalPosition() {
	   System.out.println("Back to original position");
   }
    @Test
    public void testCase() {
    	
    	System.out.println("Actual test case");
    }
}


