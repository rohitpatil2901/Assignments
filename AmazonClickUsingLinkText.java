package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClickUsingLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		try{
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		
		WebElement custService=driver.findElement(By.partialLinkText("Service"));
		custService.click();
	}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
		driver.quit();
		
		}
	}
	
}
