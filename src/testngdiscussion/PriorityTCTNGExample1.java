package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityTCTNGExample1 {
	
	
@Test(priority=1000)
public void login() {
		System.out.println("login test case");
	}

@Test(priority=200)
public void Home() {
	
	System.out.println("home test case");
}

@Test(priority=300)
public void dashbaord() {
	
	System.out.println("dashboard test case");
}

@Test(priority=100)
public void logout() {
	
	System.out.println("logout test case");
}
	
}
