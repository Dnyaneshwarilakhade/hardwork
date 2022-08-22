package Basics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodAnotationsPractice {
	
	
	@BeforeMethod
	public void login() {
		System.out.println("Logged into the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	@Test(priority=2)
	public void homePageTest() {
		Reporter.log("Logged into the application");
		System.out.println("Testing home Page");
		Reporter.log("Tested home page successfully");
		Reporter.log("Logged out from the application");
	}
	
	@Test(priority=3)
	public void notificationPageTest() {
		Reporter.log("Logged into the application");
		System.out.println("Testing Notification Page");
		Reporter.log("Tested notification page successfully");
		Reporter.log("Logged out from the application");
	}
	
	@Test(priority=1)
	public void profilePageTest() {
		Reporter.log("Logged into the application");
		System.out.println("Testing profile page");
		Reporter.log("Profile page tested successfully");
		Reporter.log("Logged out from the application");
	}
	

}
