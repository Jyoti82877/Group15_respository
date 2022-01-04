package testngdiscussion;

import org.testng.annotations.Test;

public class ListenerTest {
	
	@Test(priority=1)
	public void loginTest() {
		
		System.out.println("Login test case");
	}
	@Test(priority=2, dependsOnMethods = "loginTest")
	public void home() {
		
		System.out.println("home test case");
	}
	@Test(priority=3)
	public void profile() {
		
		System.out.println("profile test case");
	}

}
