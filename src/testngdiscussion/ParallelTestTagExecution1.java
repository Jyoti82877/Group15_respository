package testngdiscussion;

import org.testng.annotations.Test;

public class ParallelTestTagExecution1 {
	@Test
	public void navToGoogle() {
		
		System.out.println("Navigation to google");
	}
	
	@Test
	public void profile() {
		
		System.out.println("Profile test case");
	}

}
