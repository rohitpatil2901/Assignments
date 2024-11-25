package TestNGg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TimeOutAnnotation {

	@Test(timeOut=2000)
	public void OpenBrowser() {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	}	
}
