package Basics;

import org.testng.annotations.Test;

public class IntroductionToTestNG {
	
	//@Test==>Annotation==>@==>annotations
	//1.open url==>login==>logout
	//output==>3 place
	//1.regular console
	//2.testing console
	//3.report(test-output)
	
	//testing ==?execute==>alphabetical order
	//testing execution control==>keyword==>priority==>numerical numbers==>positive,negative or zero
	
	@Test(priority=3)
	public void logout() {
		System.out.println("Logged out from the application successfully");
	}
	
	@Test(priority=1)
	public void openUrl() {
		System.out.println("Url is opened");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("logged into thee application successfully");
	}
	

}
