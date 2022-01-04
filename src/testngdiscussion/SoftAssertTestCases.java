package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestCases {
@Test
public void testCases1() {
	
Reporter.log("First line", true);

SoftAssert sa=new SoftAssert();

sa.assertEquals(true, false);

Reporter.log("Second line", true);

sa.assertAll();	
}
}
