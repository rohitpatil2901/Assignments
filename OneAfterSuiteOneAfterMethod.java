package TestNGg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneAfterSuiteOneAfterMethod {

	@AfterSuite
	public void after_suite() {
		System.out.println("AfterSuitefunc");

	}
	
	@Test
	public void the_TC() {
		System.out.println("TestCasefunc");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("BeforeMethodfunc");
	}

}
