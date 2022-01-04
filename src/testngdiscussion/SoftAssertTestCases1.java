package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestCases1 {
	@Test
	public void testCases2() {
		
		Reporter.log("first line", true);
		SoftAssert sa=new SoftAssert();
		
		sa.assertTrue(true,"test case failed");
		
		Reporter.log("Second line", true);
		
		sa.assertEquals("abc", "hig");
		
		Reporter.log("third line", true);
		
		sa.assertAll();
		
		
		
	}

}
