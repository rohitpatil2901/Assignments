package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggestionListAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjn8tLq5PeJAxUZo2YCHa0XIUgYABAAGgJzbQ&ae=2&aspm=1&co=1&ase=2&gclid=CjwKCAiA3ZC6BhBaEiwAeqfvyk6aoN8eNbafIHyst1yLHZa7-VeBccwr60tTbUmlocfihxuEx9_zqhoCZvUQAvD_BwE&ohost=www.google.com&cid=CAESVeD25JpO_dBLeqyOmFoCBh8AbigwYC-12pwNVeLpuPzlWKP4neSc3GrG9L1q1a2_g84b4BODuD5tlP7walJDfHrtrPWFiD4pyTfx6XRps76J__t9RXI&sig=AOD64_0VGp6C-VpMt2xG0uVk6bC7Go1YHQ&q&nis=4&adurl&ved=2ahUKEwjfl83q5PeJAxWZ-zgGHRpjEfYQ0Qx6BAgPEAE");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("shoes");
		Thread.sleep(3000);
		List<WebElement> autoSuggestList=driver.findElements(By.xpath("//div[@class='nav-issFlyout nav-flyout']"));
		
		for(int i=0; i<autoSuggestList.size();i++) {
			
			autoSuggestList.get(i).getText();
			System.out.println(autoSuggestList.get(i).getText());
		}
	}

}
