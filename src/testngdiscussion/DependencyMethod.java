package testngdiscussion;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	@Test(priority=1)
	public void login() {
		
		System.out.println("login test case");
	}
	@Test(priority=2, dependsOnMethods = "login")
   public void dashBoardTest() {
		
		System.out.println("dash board test case");
	Assert.fail();
	}
   
	@Test(priority=3, dependsOnMethods = "dashBoardTest")
	public void checkBox() {
		
		System.out.println("log off test case");
	}
	@Test(priority=4, dependsOnMethods = {"dashBoardTest", "login"})
	public void logoff() {
		
		System.out.println("logoff test case");
	}


}
