package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNg {
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("before test annotation from test class 1");
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("before class annotation from test class 1");
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("before method annotation from test class 1");
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("after class annotation from test class1");
	}
	@Test(priority=1)
	public void testCases1() {
		
		System.out.println("Actual test case 1");
	}
	@Test
	public void testClass2() {
		
		System.out.println("Actual test case 2");
		}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after Method annotation from test class1");
	}
}


