package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAMTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver d=new ChromeDriver();
		d.get("file:///C:/Users/V-Rohit.Patil/Documents/grotechminds.html");
		d.manage().window().maximize();
		WebElement e=d.findElement(By.xpath("(/html/body/input)[1]"));
		e.sendKeys("Sowmya");
		WebElement e1=d.findElement(By.xpath("(/html/body/input)[2]"));
		e1.sendKeys("test");
		WebElement e2=d.findElement(By.xpath("(/html/body/input)[3]"));
		e2.sendKeys("Parsi123");
		WebElement e3=d.findElement(By.xpath("(/html/body/form/input)[1]"));
		e3.sendKeys("Sowmya");
		WebElement e4=d.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
		e4.click();
		
		WebElement e5=d.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		e5.click();
		WebElement e6=d.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		e6.click();
		WebElement e7=d.findElement(By.xpath("(/html/body/input)[4]"));
		e7.click();
		WebElement e8=d.findElement(By.xpath("(/html/body/input)[5]"));
		e8.click();
		WebElement e9=d.findElement(By.xpath("(/html/body/input)[6]"));
		e9.click();
		WebElement e10=d.findElement(By.xpath("/html/body/a"));
		e10.click();
		d.navigate().back();
		WebElement e11=d.findElement(By.xpath("/html/body/select"));
		Select s=new Select(e11);
		s.selectByValue("2");
	}

}
