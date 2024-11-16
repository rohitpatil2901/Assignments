package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		try{
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		

		
		Thread.sleep(3000);
		WebElement fashion=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
		

	
		Actions act=new Actions(driver);
		act.moveToElement(fashion).perform();
		Thread.sleep(3000);
		
		WebElement mensFootwear=driver.findElement(By.xpath("(//a[@class='_1BJVlg'])[3]"));
		act.moveToElement(mensFootwear).perform();
		
		WebElement mensSportShoes=driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
		act.moveToElement(mensSportShoes).perform();
		mensSportShoes.click();
	}
		catch(Exception e){
		e.printStackTrace();	
		}
		
		finally {
			
			driver.close();
		}
		}
		

}
