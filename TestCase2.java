package retryAnalyzertest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test(retryAnalyzer=retryAnalyzertest.IRetry_AnalyzerUse.class)
	public void amazonSearch() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("rp@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_passwor")).sendKeys("rp@123"); //intentionally failing this step
		driver.findElement(By.id("signInSubmit")).click();
	}
}
