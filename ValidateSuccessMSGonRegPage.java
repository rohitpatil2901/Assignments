package assertions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateSuccessMSGonRegPage {

	@Test
	public void regPage() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys("Rohit");
		
		
		driver.findElement(By.name("lname")).sendKeys("Patil");
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeScript("window.scrollBy(0, 450)");
	        Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("ro@gmail.com");
		driver.findElement(By.name("password")).sendKeys("rp@123");
		driver.findElement(By.id("male")).click();
		
		 
      
		
		Select skills=new Select(driver.findElement(By.name("Skills")));
		skills.selectByValue("select1");
		
		Select country=new Select(driver.findElement(By.name("Country")));
		country.selectByValue("China");
		
		driver.findElement(By.id("Present-Address")).sendKeys(" present address");
		driver.findElement(By.id("Permanent-Address")).sendKeys(" permanent address");
		driver.findElement(By.name("Pincode")).sendKeys("416416");
		
		
		Select religion=new Select(driver.findElement(By.name("Relegion")));
		religion.selectByValue("Hindu");
		
		WebElement uploadFile=driver.findElement(By.name("file"));
		uploadFile.sendKeys("C:\\Users\\V-Rohit.Patil\\Downloads\\test 1.txt");
		
		
		
		driver.findElement(By.xpath("//input[@class='relocate form-check-input']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		
		Alert alrt=driver.switchTo().alert();
		String str=alrt.getText();
		Assert.assertEquals(str, " Registerd successfully!!");
		System.out.println("Alert message: "+str);
		System.out.println("Alert message showing as expected");
		alrt.accept();
	}
}
