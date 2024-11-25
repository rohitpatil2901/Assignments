package TestNGg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class OneAfterMethodwithTwoTest {

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
}
