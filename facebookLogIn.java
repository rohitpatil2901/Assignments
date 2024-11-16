package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pw=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginButton=driver.findElement(By.xpath("//button[.='Log in']"));
		
		un.sendKeys("Rohit");
		pw.sendKeys("Rohit@123");
		loginButton.sendKeys(Keys.ENTER);
		
	}

}
