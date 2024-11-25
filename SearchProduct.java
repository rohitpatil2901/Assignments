package testNgAutomationScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProduct extends LaunchAndQuitBrowser {

	@Test
	public void searchAmazonProduct() {

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);

//		WebElement firstShoes = driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
//		firstShoes.click();

		

		WebElement product = driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		product.click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();
		
		driver.switchTo().window(child);
		System.out.println("Child Window Title" + driver.getTitle());
		
		WebElement AddToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		AddToCart.click();

	}

}
