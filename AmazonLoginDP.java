package testNgAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLoginDP {

	@DataProvider(name="AmazonLogin")
	
	public Object[][] loginDetails(){
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="amazon@gmail.com";
		obj[0][1]="amazon@123";
		
		obj[1][0]="amazon@gmail.com";
		obj[1][1]="amazon@123";
		
		return obj;
	}
	
	@Test(dataProvider="AmazonLogin")
	public void amazonLoginTest(String Email, String pass) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Email);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
		
	}
}
