package TestNGg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreeTest1AM1BM {

	@Test()
	public void testOnes() {
		System.out.println("TestOne");
	}

	@Test()
	public void testTwos() {
		System.out.println("TestTwo");
	}
	
	@Test()
	public void testThrees() {
		System.out.println("TestThree");
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
