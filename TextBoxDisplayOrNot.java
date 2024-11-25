package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDisplayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.id("fname"));
		boolean isDisplay=textbox.isDisplayed();
		
		if(isDisplay) {
			System.out.println("Checkbox is displayed");
		}
		else {
			System.out.println("Checkbox not displayed");
		}
	}

}
