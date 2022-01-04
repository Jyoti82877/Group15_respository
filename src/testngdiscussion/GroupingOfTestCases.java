package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@Test(groups="sanity", priority=1)
	public void login() {
		
		System.out.println("login test cases");
	}
    @Test(groups="Regression" ,priority=2)
	public void dashBoardTest() {
		
		System.out.println("dashbaord test case");
	}
    @Test(groups="Regression", priority=3)
	public void checkBox() {
		
		System.out.println("checkbox");
	}
	@Test(groups= "sanity", priority=4)
	public void logoff() {
		
		System.out.println("logoff");
	}
	@Test(groups="sanity", priority=5)
	public void home() {
		
		System.out.println("home test cases");
	}
	
	@Test(groups="functional", priority=6)
	public void profile() {
		
		System.out.println("profile accessibility test cases");
	}
	
}
