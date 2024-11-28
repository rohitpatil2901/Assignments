package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateAmazonLoginOut {
	
	@Test
	
	public void amazonLogin() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("rohitpatil2901@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("rohitpatil@0202");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement user=driver.findElement(By.xpath("//span[.='Hello, Rohit']"));
		
		//Assert.assertEquals(user.getText(), "Hello, Rohit", "User is logged in Successfully");
		Assert.assertEquals(user.getText(), "Hello, Rohit", "User is failed to log in");
		System.out.println("Assertion Passed: User is logged in Successfully");
		
		Thread.sleep(2000);
		
		

		
		WebElement logout=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement logoutbox=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement logoutarrow=driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
		Actions act=new Actions(driver);
		
		
		act.moveToElement(logoutarrow).build().perform();
		
		Thread.sleep(4000);
		
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		
		
		Thread.sleep(2000);
		String signIn=driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).getText();
		Assert.assertEquals(signIn, "Sign in", "Log out failed");
		System.out.println("Log out Successfull");
		
		
	}
	
}
