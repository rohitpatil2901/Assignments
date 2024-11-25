package testNgAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchProduct extends LaunchAndQuitBrowser {

	@Test
	public void searchAmazonProduct() {
		
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		WebElement firstShoes=driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		firstShoes.click();
	}

}
