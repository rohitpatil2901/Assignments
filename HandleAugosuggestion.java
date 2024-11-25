package package1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAugosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//handling auto suggestion for google
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
		
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("shoes");
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='aajZCb']"));
		int listSize=list.size();
		System.out.println(listSize);
		for(int i=0; i<listSize; i++) {
			WebElement a1=list.get(i);
			String items=a1.getText();
			System.out.println(items);
			
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
		driver.close();	
		}
		
	}

}
