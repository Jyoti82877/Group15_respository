package testngdiscussion;

import org.testng.annotations.Test;

public class ParallelTestTagExecution3 {
	@Test
	public void navToOrange() {
		
		System.out.println("Navigate to orange .com");
	}
	@Test
	public void home() {
		
		System.out.println("home test case");
	}

}
