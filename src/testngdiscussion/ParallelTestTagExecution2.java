package testngdiscussion;



import org.testng.annotations.Test;

public class ParallelTestTagExecution2 {
	
	@Test
	public void navToFlipkart() {
		
		System.out.println("Navigate to flipkart");
	}
	
	@Test
	public void dashBoard() {
		
		System.out.println("Dashboard test case");
	}

}
