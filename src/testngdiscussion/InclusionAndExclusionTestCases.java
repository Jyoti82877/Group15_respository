package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusionTestCases {
	
	
	@Test(priority=1)
	public void login() {
		
		System.out.println("login test case");	
	}
	@Test(priority=2)
	public void logoff() {
		
		System.out.println("logoff test case");
	}
	@Test(priority=3)
	public void home() {
		
		System.out.println("home test case");
	}
	@Test(priority=4)
	public void profile() {
		
		System.out.println("profile test case");
	}

}
