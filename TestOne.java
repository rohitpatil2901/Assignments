package TestNGg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestOne 
{
		@Test
		public void testcase1()
		{

			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
		}
	
	
}
