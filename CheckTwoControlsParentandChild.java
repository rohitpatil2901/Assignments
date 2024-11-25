package package1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckTwoControlsParentandChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=CjwKCAiA3ZC6BhBaEiwAeqfvyq6zHphVouIGpu0Aat6m7s28MJsP3nEMz-Unr7Dlh3ut7D791Qa9gBoCYDIQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//span[@class='google-text']")).click();
		
		
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> iterator=set.iterator();
		String parentId=iterator.next();
		String childId=iterator.next();
		System.out.println(parentId);
		System.out.println(childId);
		Thread.sleep(2000);
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("I Jumped here on child ");
		
	}

}
