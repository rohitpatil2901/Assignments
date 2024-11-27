package testNgAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class googleSearchwihtDP {

	@DataProvider(name="data1")
	public Object [] [] method1(){
		
		return new Object[] [] {{"Modi"} , {"SRK" }, {" Air pollution"}, {" Banglore "}, {"Salman khan"}};
	}
	
	
	@Test(dataProvider="data1")
	public void googlesearch(String input) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();
	}
	
}
