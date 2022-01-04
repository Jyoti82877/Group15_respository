package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityTCTNGExample2 {
	
	@Test(priority=-1000)
	public void login() {
		
		System.out.println("login test case");
	}
@Test(priority=200)
	public void home() {
		
		System.out.println("home test case");
	}
@Test(priority=300)
	public void dashboard() {
		
		System.out.println("dashboard test case");
	}
@Test(priority=100)
	public void logout() {
		
		System.out.println("logout test case");
	}
@Test
	public void profile() {
		
		System.out.println("profile test case");
	}
@Test(priority=100)	
	public void passwordChange() {
		
		System.out.println("password change test case");
	}
@Test(invocationCount=5)
public void testcase1() {
	
	System.out.println("test case1");
}
}
