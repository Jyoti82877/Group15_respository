package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases1 {
	@Test(groups="sanity", priority=1)
	public void editProfile() {
		
		System.out.println("edit profile test cases");
	}
	@Test(groups="regression", priority=2)
	public void viewProfile() {
		
		System.out.println("view profile test");
	}
	@Test(groups="sanity", priority=3)
	public void myInfo() {
		
		System.out.println("my info test");
	}
	@Test(groups="regression", priority=4)
	public void timeLine() {
		
		System.out.println("timeline test cases");
	}
	@Test(groups="functional", priority=5)
	public void uploadImage() {
		System.out.println("upload image profile");
	}
	@Test(groups="functional",priority=6)
	public void profile() {
		
		System.out.println("profile accesibility test cases");
	}

}
