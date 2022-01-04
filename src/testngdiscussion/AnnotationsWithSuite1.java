package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsWithSuite1 {
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("before test annotation from suite1 class");
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("before class annotation from suite1 class");
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method annotation from suite1 class");
	}
	@Test(priority=2)
	public void testCase3() {
		
		System.out.println("Actual test case3");
	}
	@Test(priority=1)
	public void testCase4() {
		
		System.out.println("Actual test case4");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method annotation from suite1 class");
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("after class annotation from suite1 class");
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("aftertest annotation from suite1 class");
	}

}
