package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsernameXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


			ChromeDriver driver=new ChromeDriver();
			
			
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=Cj0KCQiAouG5BhDBARIsAOc08RRWeo4zERHM41t7jOtW4jlbUGzwFivBUNLVHobm8sTJ8I38Tn52T2IaAoAIEALw_wcB&gclsrc=aw.ds");
			Thread.sleep(3000);
			WebElement Uname=driver.findElement(By.xpath("//input[@id='usernameField']"));
			Uname.sendKeys("Rohit@123");
	}

}
