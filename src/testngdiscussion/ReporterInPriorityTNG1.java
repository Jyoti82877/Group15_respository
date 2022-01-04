package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterInPriorityTNG1 {
	
	@Test
public void urlValidation() {
		
		//System.out.println("url validation over home page");
		Reporter.log("URL validation over home page",true);
}
	
	@Test
public void profileSection() {
		
		//System.out.println("profile section for home page");
		
		Reporter.log("profile section for home page", true);
	}

}