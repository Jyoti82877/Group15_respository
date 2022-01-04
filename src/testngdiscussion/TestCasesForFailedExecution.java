package testngdiscussion;

import org.testng.annotations.Test;

public class TestCasesForFailedExecution {
	
	@Test(dependsOnMethods = "testingdiscussion_testng.SoftAssertDisc.testCase1")
	public void loginTest() {
		
		System.out.println("Login test case");
		}
	@Test
	public void home() {
		
		System.out.println("home test case");
	}

	@Test
	public void a() {
		
		System.out.println("a test case");
	}
	
	
}
