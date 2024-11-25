package TestNGg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoTestOneAMandOneBM {

	@Test()
	public void testOnes() {
		System.out.println("TestOne");
	}

	@Test()
	public void testTwos() {
		System.out.println("TestTwo");
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
