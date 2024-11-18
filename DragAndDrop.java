package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");

		WebElement drag=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
		act.dragAndDrop(drop, drag).perform();
	}

}
