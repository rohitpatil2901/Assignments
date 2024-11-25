package testNgAutomationScenarios;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuitBrowser {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("Browser")
	public void Launch(String nameOfBrowser) {

		if(nameOfBrowser.equals("chrome")) {
		System.out.println("launching browser");
		driver=new ChromeDriver();
		} 
		
		if(nameOfBrowser.equals("firefox")) {
			System.out.println("launching browser");
			driver=new FirefoxDriver();
			}
		
		if(nameOfBrowser.equals("edge")) {
			System.out.println("launching browser");
			driver=new EdgeDriver();
			}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		

	}

	@AfterMethod
	public void Quit() {
		System.out.println("logout and closing browser");
		driver.quit();

	}

}
