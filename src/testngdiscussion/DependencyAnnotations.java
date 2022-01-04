package testngdiscussion;



import org.junit.Assert;
import org.testng.annotations.Test;



public class DependencyAnnotations {
	@Test(priority=1)
	public void login() {
		
		System.out.println("login class test case");
		Assert.fail();
		
	}
	@Test(priority=2, dependsOnMethods = "login")
	public void dashBoardTest() {
		
		System.out.println("dash board test case");
	}
	@Test(priority=3, dependsOnMethods = "dashBoardTest")
	public void logoff() {
		
		System.out.println("log off test case");
	}

}
