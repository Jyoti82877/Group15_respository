package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterInPriorityTNG {
	@Test
	public void loginWithCorrectCrendential() {
		
		//System.out.println("login with correct credential");
		Reporter.log("login test case with correct credential", true);
		
	}
	@Test
	public void loginWithInCorrectCredntial() {
		
		//System.out.println("login with incorrect credential");
		
		Reporter.log("login test case with incorrectcredentail", true);
	}

}
