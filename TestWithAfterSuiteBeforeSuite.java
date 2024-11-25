package TestNGg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestWithAfterSuiteBeforeSuite {

	@BeforeSuite
	public static void registerNewMember() {
		
	System.out.println("BeforeSuite");	
	}
	
	
	@Test
	public void log_in() {
		
		System.out.println("log_in");
	}
	
	
	@Test
	public void log_out() {
		System.out.println("log_out");
	}
	
	@AfterTest
	public void close_Browser() {
		
		System.out.println("AfterTest");
	}
}
