package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InnotationsWithSuite {
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("before suite annotations");
	}
	@AfterSuite
	public void afterSuit() {
		
		System.out.println("after suite annotations");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("before test annotation");
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("before class annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method annotation");
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("after class annotation");
	}
	@Test(priority=1)
	public void testCase1() {
		
		System.out.println("Actual test case1");
	}
	@Test(priority=2)
	public void testCase2() {
		
		System.out.println("Actual test case2");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method annotation");
	}
	
	
}
