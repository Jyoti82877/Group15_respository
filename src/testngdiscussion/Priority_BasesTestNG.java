package testngdiscussion;

import org.testng.annotations.Test;

public class Priority_BasesTestNG {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login test case");
	}
	
	@Test(priority=2)
	public void home() {
		
		System.out.println("home test case");
	}
	
	@Test(priority=3)
	public void dashboard() {
		
		System.out.println("dashboard test case");
	}
	
	
	

}
