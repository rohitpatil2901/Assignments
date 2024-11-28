package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateSearchBoxEnabledDisplayed {

	
	@Test
	public void amazonSearchBoxValidate() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		
		Assert.assertTrue(searchBox.isDisplayed(), "searchbox is not displayed");
		Assert.assertTrue(searchBox.isEnabled(), "searchbox is not enabled");
		
		System.out.println("searchbox is enabled and displayed");
//		if(searchBox.isDisplayed() && searchBox.isEnabled()) {
//			
//			System.out.println("SearchBox is displayed and enabled");
//		}
		
		
	}
}
