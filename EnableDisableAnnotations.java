package TestNGg;

import org.testng.annotations.Test;

public class EnableDisableAnnotations {

	@Test(enabled=true, priority=2)
	public void LoginBrowser() {
		
		System.out.println("LoggedIn");
	}
	
	@Test(enabled=false)
	public void LogoutBrowser() {
		
		System.out.println("LoggedOut");
	}
	
	@Test
	public void ClosedBrowser() {
		
		System.out.println("ClosedInstance");
	}
}
