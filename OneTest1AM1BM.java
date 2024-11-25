package TestNGg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OneTest1AM1BM {

	@Test()
	public void testone() {
		System.out.println("TestOne");
	}

	@AfterMethod
	public void testAfters() {
		System.out.println("AfterMethod");
	}

	@BeforeMethod
	public void testAfterss() {
		System.out.println("BeforeMethod");
	}
}
