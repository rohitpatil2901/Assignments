package TestNGg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AfterSuiteBEforeSuiteAfterMethod {

	@AfterSuite
	public void afters() {
		System.out.println("aftersA");
	}
	
	@BeforeSuite
	public void beforesuites() {
		System.out.println("BeforesuitesA");
	}
	
	@Test
	public void test_s() {
		System.out.println("tests");
	}
	
	@AfterMethod
	public void aftermethods() {
		System.out.println("aftermethodA");
	}
}
