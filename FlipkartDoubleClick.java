package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub

				ChromeDriver driver=new ChromeDriver();
				
				try{
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				WebElement cart=driver.findElement(By.xpath("(//a[.='Cart'])"));
				
				Actions act=new Actions(driver);
				act.doubleClick(cart).build().perform();
				Thread.sleep(3000);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				finally {
					driver.close();
				}
	}

}
