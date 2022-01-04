package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNg1 {
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("before test annotation from test class2");
	}
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("before class annotation from test class 2");
	}
	@BeforeMethod
	public void beforMethod() {
		
		System.out.println("befor method annotation from test class 2");
	}

	@Test(priority=1)
	public void testCase3() {
		
		System.out.println("Actual test case 3");
	}
	@Test(priority=0)
	public void testCase4() {
		
		System.out.println("Actual test case 4");
	}
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after method annotation from test class 2");
	}
	@AfterClass
	public void afterClass() {
		
		System.out.println("after class annotation from test class 2");
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("after test annotation from test class 2");
	}
}
