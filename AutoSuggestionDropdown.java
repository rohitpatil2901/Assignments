package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login']")).click(); 

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes");
		//Thread.sleep(5000);
		
//		List<WebElement> e1 = wait.until(
//			    ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//form[@class='Hy6F9O header-form-search']/ul/li"))
//			);
		List<WebElement> e1= driver.findElements(By.xpath("//form[@class='Hy6F9O header-form-search']/ul/li"));
		//Thread.sleep(8000);
		int length=e1.size();
		//System.out.println(length);
		//Thread.sleep(8000);
		for(int i=0;i<length;i++) {
			
			WebElement a1=e1.get(i);
			String autoSuggestion=a1.getText();
			
			System.out.println(autoSuggestion);
		}
		}
		catch(Exception e){
			
		e.printStackTrace();	
		
		}
		
		finally {
			driver.close();
		}
	}}


