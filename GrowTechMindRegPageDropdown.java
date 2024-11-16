package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrowTechMindRegPageDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		try{
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(7000);
		WebElement fstname=driver.findElement(By.id("fname"));
		WebElement lstname=driver.findElement(By.id("lname"));
		WebElement email=driver.findElement(By.name("email"));
		WebElement pwd=driver.findElement(By.cssSelector("#password"));
		WebElement maleRadiobtn=driver.findElement(By.xpath("//input[contains(@class,'male form-check-input ')]"));
		WebElement skillList=driver.findElement(By.id("Skills"));
		WebElement  countryList=driver.findElement(By.id("Country"));
		WebElement religion=driver.findElement(By.id("Relegion"));
		WebElement techskill=driver.findElement(By.id("technicalskills"));
		
		fstname.sendKeys("Rohit");
		lstname.sendKeys("Patil");
		email.sendKeys("test123@gmail.com");
		pwd.sendKeys("test@123");
		maleRadiobtn.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, window.innerHeight / 2);");
		js.executeScript("window.scrollBy(0, 100);"); // Scroll by 500px
		Thread.sleep(2000); // Pause for 2 seconds

		
		Select select=new Select(skillList);
		select.selectByIndex(1);
		
		
		Select selec3=new Select(techskill);
		selec3.selectByIndex(3);
		
		Thread.sleep(3000);
		Select select1=new Select(countryList);
		select1.selectByVisibleText("Afganistan ");
		Select select2=new Select(religion);
		select2.selectByVisibleText("Hindu");
	
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			driver.quit();
			
		}	
	

}
}