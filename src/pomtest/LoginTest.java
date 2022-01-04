package pomtest;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void loginToApp() {
		
		lp.loginWithCredentials();
		
		lp.enterPin();
	}
	
	public void validatePage() {
		
		boolean returnedvalue= lp.verifyUrl();
		
		Assert.assertTrue(returnedvalue);

	}}
